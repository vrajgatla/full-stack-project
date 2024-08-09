package com.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException  (Long id){
        super("could notfound the user with id"+id);
    }

}
