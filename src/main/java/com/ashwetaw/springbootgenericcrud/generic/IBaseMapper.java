package com.ashwetaw.springbootgenericcrud.generic;

import java.util.List;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
public interface IBaseMapper <D,E>{
    E toEntity(D dto);
    D toDTO(E entity);
    List<E> toEntityList(List<D> dtoList);
    List <D> toDTOList(List<E> entityList);
}
