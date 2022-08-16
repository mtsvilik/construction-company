package com.solvd.constructioncompany.exception;

public class InvalidTypeException extends Exception {

    public InvalidTypeException(String message) {
        super(message);
    }

    public InvalidTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
