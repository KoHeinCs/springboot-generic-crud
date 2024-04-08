package com.ashwetaw.springbootgenericcrud.repositories;

import com.ashwetaw.springbootgenericcrud.entities.Country;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

/**
 * @author koheincs
 * @created at 08/04/2024
 **/
@EnableScan
public interface ICountryRepository extends CrudRepository<Country,String> {
}
