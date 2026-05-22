package com.example.demo_SSM.exception;

public class AlreadyExistException extends RuntimeException{
public AlreadyExistException(String message) {
        super(message);
    }
}
