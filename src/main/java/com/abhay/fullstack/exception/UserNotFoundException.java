package com.abhay.fullstack.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id)
    {
          super("could not fount the user with id:"+id);

    }
}
