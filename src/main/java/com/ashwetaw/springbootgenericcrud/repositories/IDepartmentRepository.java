package com.ashwetaw.springbootgenericcrud.repositories;

import com.ashwetaw.springbootgenericcrud.entities.Department;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@EnableScan
public interface IDepartmentRepository extends CrudRepository<Department,String> {
}
