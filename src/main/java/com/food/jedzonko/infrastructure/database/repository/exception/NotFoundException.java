package com.food.jedzonko.infrastructure.database.repository.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(final String message){
        super(message);
    }
}
