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
    //8. char-> Character

    public static void main(String[] args) {
        testByte();
        testShort();
        testInteger();
        testLong();
        testFloat();
        testDouble();
        testCharacter();
        testBoolean();
    }

    private static void testBoolean() {
        boolean b = false;
        Boolean bl = b;
        System.out.println(bl.toString());
    }

    private static void testCharacter() {
        char c  = 'a';
        Character ch = c;
        System.out.println(ch.toString());
    }

    private static void testFloat() {
        String a = "10.5f";
        Float f = Float.valueOf(a);
        float b = f;
        System.out.println(f.intValue());
    }

    private static void testLong() {
        Long l = 100L;
        System.out.println(l.floatValue());
    }

    private static void testShort() {
        Integer a = 10;
        short s = Short.parseShort(a.toString());
        System.out.println(s);
    }

    private static void testDouble() {
        double d = 10.67d;
        Double m = 10.67d;
        System.out.println(m.compareTo(10.87));
        System.out.println(m.equals(d));
        System.out.println(Math.round(m));
    }

    private static void testInteger() {
        String m = "100";
        int x = Integer.valueOf(m);
        Integer a = 10;
        a = a+5;

        System.out.println(a.floatValue());
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
