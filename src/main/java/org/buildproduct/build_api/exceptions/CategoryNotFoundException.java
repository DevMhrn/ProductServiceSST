package org.buildproduct.build_api.exceptions;

public class CategoryNotFoundException extends RuntimeException{
private Long id;
    public CategoryNotFoundException(String message, Long id) {
        super(message);
        this.id = id;
        // if we extend exception then it will be checked exception
    }



}
