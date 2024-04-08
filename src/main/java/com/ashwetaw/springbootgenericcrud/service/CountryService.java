package com.ashwetaw.springbootgenericcrud.service;

import com.ashwetaw.springbootgenericcrud.dto.CountryDTO;
import com.ashwetaw.springbootgenericcrud.entities.Country;
import com.ashwetaw.springbootgenericcrud.generic.BaseService;
import com.ashwetaw.springbootgenericcrud.mapper.ICountryMapper;
import com.ashwetaw.springbootgenericcrud.repositories.ICountryRepository;
import org.springframework.stereotype.Service;

/**
 * @author koheincs
 * @created at 08/04/2024
 **/
@Service
public class CountryService  extends BaseService<CountryDTO, Country, String> {
    public CountryService(ICountryRepository countryRepository, ICountryMapper countryMapper) {
        super(countryRepository, countryMapper);
    }
}
