package com.ashwetaw.springbootgenericcrud.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
public class ResponseHandler {
    private static Map<String,Object> response = new HashMap<>();

    public static  <T> ResponseEntity<Object> createHttpResponse(T object, String message, HttpStatus httpStatus){
        CommonResponse responseDTO = new CommonResponse(object,message,httpStatus);
        response.put("response",responseDTO);
        return new ResponseEntity<>(response,httpStatus);
    }

    public static ResponseEntity<Object> createHttpResponse(String message,HttpStatus httpStatus){
        CommonResponse responseDTO = new CommonResponse(message,httpStatus);
        response.put("response",responseDTO);
        return new ResponseEntity<>(response,httpStatus);
    }
}
