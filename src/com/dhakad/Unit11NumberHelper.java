package com.dhakad;

public class Unit11NumberHelper {
    //Number Helper classes
    //1. byte-> Byte
    //2. short->Short
    //3. int -> Integer
    //4. long-> Long
    //5. float-> Float
    //6. double -> Double
    //7. boolean-> Boolean
    //8. char-> Char

    public static void main(String[] args) {
        testByte();
    }

    private static void testByte() {
        //primitive data type
        String value = "100";
        Byte m = Byte.parseByte(value);
        byte b = m;

        System.out.println((short)b);

        //Helper data type
        Byte aByte = 10;
        System.out.println(aByte.shortValue());
    }

}
