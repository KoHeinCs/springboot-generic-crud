package com.ashwetaw.springbootgenericcrud.controller;

import com.ashwetaw.springbootgenericcrud.dto.DepartmentDTO;
import com.ashwetaw.springbootgenericcrud.generic.BaseController;
import com.ashwetaw.springbootgenericcrud.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ashwetaw.springbootgenericcrud.common.ApiConstant.*;


/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@RestController
@RequestMapping(department)
public class DepartmentController extends BaseController<DepartmentDTO, String> {
    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
    }

}
