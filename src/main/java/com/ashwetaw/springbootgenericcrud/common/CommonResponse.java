package com.ashwetaw.springbootgenericcrud.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {
    private T data;
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String message;
    private LocalDateTime localDateTime;

    public CommonResponse(T data) {
        this.data = data;
        this.localDateTime = LocalDateTime.now();
    }

    public CommonResponse(T data, String message) {
        this(data);
        this.message = message;
    }

    public CommonResponse(T data, String message, HttpStatus httpStatus) {
        this(data,message);
        this.httpStatusCode = httpStatus.value();
        this.httpStatus = httpStatus;

    }

    public CommonResponse(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatusCode = httpStatus.value();
        this.httpStatus = httpStatus;
        this.localDateTime = LocalDateTime.now();

    }


}
