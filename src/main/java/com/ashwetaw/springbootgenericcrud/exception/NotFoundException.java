package com.ashwetaw.springbootgenericcrud.exception;


/**
 * @author Hein Htet Aung
 * @created at 05/11/2022
 **/
public class NotFoundException extends ApplicationException {
    public NotFoundException(String exception) {
        super(exception);
    }
}
