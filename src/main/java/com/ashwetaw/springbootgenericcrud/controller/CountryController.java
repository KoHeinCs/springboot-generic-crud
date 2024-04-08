package com.ashwetaw.springbootgenericcrud.controller;

import com.ashwetaw.springbootgenericcrud.dto.CountryDTO;
import com.ashwetaw.springbootgenericcrud.generic.BaseController;
import com.ashwetaw.springbootgenericcrud.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ashwetaw.springbootgenericcrud.common.ApiConstant.country;

/**
 * @author koheincs
 * @created at 08/04/2024
 **/
@RestController
@RequestMapping(country)
public class CountryController extends BaseController<CountryDTO, String> {
    public CountryController(CountryService countryService) {
        super(countryService);
    }
}
