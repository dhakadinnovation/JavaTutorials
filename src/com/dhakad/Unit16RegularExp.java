package com.dhakad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unit16RegularExp {
    public static void main(String[] args) {
        testRegularExp();
        testEmailIdValidation();
    }

    private static void testEmailIdValidation() {

    }

    private static void testRegularExp() {
       String REGEX ="^(.+)@(.+)$";
       String [] INPUT = {"user@domain.com",
               "user@domain.co.in",
               "user1@domain.com",
               "user.name@domain.com",
               "user#domain.com",
               "@yahoo.com"};

            Pattern p =Pattern.compile(REGEX);
        for (String email: INPUT) {
            Matcher m = p.matcher(email);

            System.out.println( "Email : "+email +"validate : "+m.matches());

        }

    }
}
