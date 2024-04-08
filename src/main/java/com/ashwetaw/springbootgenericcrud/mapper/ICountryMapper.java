package com.ashwetaw.springbootgenericcrud.mapper;

import com.ashwetaw.springbootgenericcrud.dto.CountryDTO;
import com.ashwetaw.springbootgenericcrud.entities.Country;
import com.ashwetaw.springbootgenericcrud.generic.IBaseMapper;
import org.mapstruct.Mapper;

/**
 * @author koheincs
 * @created at 08/04/2024
 **/
@Mapper(componentModel = "spring")
public interface ICountryMapper extends IBaseMapper<CountryDTO, Country> {
}
