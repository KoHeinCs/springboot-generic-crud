package com.ashwetaw.springbootgenericcrud.dto;

import lombok.Data;

/**
 * @author koheincs
 * @created at 08/04/2024
 **/
@Data
public class CountryDTO {
    private String id;
    private String name;
    private String description;
    private String code;
}
