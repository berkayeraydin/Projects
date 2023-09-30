package com.berkay.fullStackProjeBackend.core.exceptions.types;


public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
