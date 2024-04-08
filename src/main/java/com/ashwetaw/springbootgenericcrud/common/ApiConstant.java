package com.ashwetaw.springbootgenericcrud.common;

/**
 * @author koheincs
 * @created at 07/04/2024
 **/
public class ApiConstant {

    public static final String endPoint = "/api";

    public static final String  create = "/create";
    public static final String  update = "/update/{id}";
    public static final String  all =  "/all";
    public static final String  findById = "/find/{id}";
    public static final String  deleteById = "/delete/{id}";

    /**  rest api for department **/
    public static final String  department = endPoint+"/department";

    /**  rest api for country **/
    public static final String  country = endPoint+"/country";


}
