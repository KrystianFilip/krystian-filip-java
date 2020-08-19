package basics.validator;

import java.util.*;
import java.lang.*;
import java.io.*;

public class UserValidator {

    public void validateAge(int age) {
        if (age < 18) {
            System.out.println("User is too young!");
        } else {
            System.out.println("User is an adult.");
        }
    }

    public void validateSex(char sex) {
        if (sex == 'm') {
            System.out.println("User is a male.");
        } else if (sex == 'f') {
            System.out.println("User is a female.");
        } else {
            System.out.println("Sex unknown.");
        }

    }

    public void validateCountry(String country) {
        if (country.equalsIgnoreCase("Poland")) {
            System.out.println("Onion Lover?");
        } else if (country.equalsIgnoreCase("America")) {
            System.out.println("Black Lives Matter.");
        } else {
            System.out.println("Other nation...");
        }
    }
}
