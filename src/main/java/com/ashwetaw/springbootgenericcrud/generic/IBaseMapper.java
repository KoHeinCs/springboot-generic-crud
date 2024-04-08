package com.ashwetaw.springbootgenericcrud.generic;

import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
public interface IBaseMapper <D,E>{
    @Mapping(target = "id",ignore = true)
    E toEntity(D dto);
    D toDTO(E entity);
    List<E> toEntityList(List<D> dtoList);
    List <D> toDTOList(List<E> entityList);
}
