package com.ashwetaw.springbootgenericcrud.generic;

import com.ashwetaw.springbootgenericcrud.common.MessageConstant;
import com.ashwetaw.springbootgenericcrud.exception.ApplicationException;
import com.ashwetaw.springbootgenericcrud.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@RequiredArgsConstructor
public abstract class BaseService<D, E, ID extends Serializable> {

    protected final CrudRepository<E, ID> crudRepo;
    protected final IBaseMapper<D, E> baseMapper;


    public D findById(ID id) throws ApplicationException {
        Optional<E> entityOptional = crudRepo.findById(id);
        if (entityOptional.isPresent())
            return baseMapper.toDTO(entityOptional.get());
        else
            throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);
    }

    public List<D> findAll() {
        List<E> entityList = (List<E>) crudRepo.findAll();
        if (entityList.isEmpty())
            return Collections.emptyList();
        else
            return baseMapper.toDTOList(entityList);
    }

    public void deleteById(ID id) throws ApplicationException{
        if (crudRepo.existsById(id))
            crudRepo.deleteById(id);
        else throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);

    }

    public D save(D dto) {
        E entity = crudRepo.save(baseMapper.toEntity(dto));
        return baseMapper.toDTO(entity);
    }

    public D update(ID id, D dto) throws ApplicationException {
        Optional<E> entityOptional = crudRepo.findById(id);
        if (entityOptional.isPresent()) {
            E entity = entityOptional.get();
            BeanUtils.copyProperties(dto, entity, "id");
            return baseMapper.toDTO(crudRepo.save(entity));
        } else
            throw new NotFoundException(MessageConstant.ENTITY_NOT_FOUND_MSG);
    }

}

