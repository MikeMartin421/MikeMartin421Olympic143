package com.olympic.cis143.m05.student.lab.trycatch;

import javax.management.BadStringOperationException;

import student.lab.trycatch.MyException;

public class ThrowsException {

    public void throwAnExceptionForMe() throws MyException {
        this.thowMultipleExceptionsForMe();
    }

    private void thowMultipleExceptionsForMe() throws MyException {
        if ( 1 == 1 ) {
            throw new MyException( new InterruptedException("Another exception that you will need to take care of."),
            		"Another exception that you will need to take care of.");
        }
        throw new MyException ( new BadStringOperationException("Simple exception that you will need to take care of"), 
        "Another exception that you will need to take care of.");
    }
}
