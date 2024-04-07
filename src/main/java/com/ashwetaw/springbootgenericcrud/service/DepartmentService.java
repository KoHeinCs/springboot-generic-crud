package com.ashwetaw.springbootgenericcrud.service;

import com.ashwetaw.springbootgenericcrud.dto.DepartmentDTO;
import com.ashwetaw.springbootgenericcrud.entities.Department;
import com.ashwetaw.springbootgenericcrud.generic.BaseService;
import com.ashwetaw.springbootgenericcrud.mapper.IDepartmentMapper;
import com.ashwetaw.springbootgenericcrud.repositories.IDepartmentRepository;
import org.springframework.stereotype.Service;


/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@Service
public class DepartmentService extends BaseService<DepartmentDTO, Department, String> {

    public DepartmentService(IDepartmentRepository departmentRepo, IDepartmentMapper departmentMapper) {
        super(departmentRepo, departmentMapper);
    }


}
