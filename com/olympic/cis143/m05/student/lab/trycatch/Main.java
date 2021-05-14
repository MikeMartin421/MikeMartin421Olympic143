package com.olympic.cis143.m05.student.lab.trycatch;

import student.lab.trycatch.MyException;

public class Main {

    public static void main (String[] a) {
        Main main = new Main();
        try {
        	main.testNeedsToBeModified();
        }
        catch(MyException exception) {
        	System.out.println("Exception caught.");
        	throw new RuntimeException();
        }
    }

    public void testNeedsToBeModified() throws MyException {
        new ThrowsException().throwAnExceptionForMe();
    }
}
