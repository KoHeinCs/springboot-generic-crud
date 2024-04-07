package com.ashwetaw.springbootgenericcrud.mapper;

import com.ashwetaw.springbootgenericcrud.dto.DepartmentDTO;
import com.ashwetaw.springbootgenericcrud.entities.Department;
import com.ashwetaw.springbootgenericcrud.generic.IBaseMapper;
import org.mapstruct.Mapper;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@Mapper(componentModel = "spring")
public interface IDepartmentMapper extends IBaseMapper<DepartmentDTO, Department> {
}
