package com.vaccine.app2.utils;

public class ValidateChoice {
	private ValidateChoice() {
	        
	}

    public static int validateInput(int input) throws IllegalArgumentException {
       try {
              if(input < 1 || input > 5) {
                throw new IllegalArgumentException("Invalid input");
              }
           return input; 
       } catch (IllegalArgumentException e) {
            e.getMessage();
            return -1;
       }
    }
}
