package com.dhakad;

import java.util.Locale;

public class Unit12String {
    public static void main(String[] args) {
        testString();
    }

    private static void testString() {
        String str = "hello world!";
        System.out.println(str);
        char [] chars = {'H','e','l','l','o'};
        String mChars = new String(chars);
        System.out.println(mChars);
        System.out.println(mChars.toLowerCase(Locale.ROOT));
        boolean b = str.equals(mChars);
        System.out.println(b);

        boolean c = str.contains(mChars.toLowerCase());
        System.out.println(c);

        String strFormat = "I have a book of Rs %d Rs %f Rs %s";
        strFormat = String.format(strFormat, 100, 100.50f, "one handred");
        System.out.println(strFormat);

        if(str.equalsIgnoreCase(strFormat))
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
