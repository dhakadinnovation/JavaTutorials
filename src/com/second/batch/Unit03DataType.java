package com.second.batch;

public class Unit03DataType {
    //Data type
    //1. Primitive data type
    //2. Non Primitive data type

    //Primitive
    //1. Integer  2. Floating point 3. Charachter 4. Boolean

    //Integer
    //1. byte 2. short 3. int 4. long

    //Floating point
    //1.float  2. double

    //Charachter
    //1. char

    //1. Boolean

    public static void main(String[] args) {
        testInteger();
        testFloating();
        testChar();
        testBoolean();
        testString();
    }

    private static void testString() {
        String value = "10000";
        System.out.println("string : "+value);
        Integer val1 = Integer.valueOf(value);
        int val2 = val1;
    }

    private static void testBoolean() {
        boolean bul = false;
        String str = "true";
        Boolean bool = Boolean.valueOf(str);
        System.out.println("boolean : "+bul);
        System.out.println("bool : "+bool);
    }

    private static void testChar() {
        char ch = 'A';
        String str1 = "M";
        Character character = Character.valueOf(ch);
        System.out.println(" char : "+ch);
        System.out.println(" character : "+character.toString().toLowerCase());
        System.out.println(" character : "+character);
        ch = '\u0000';
        System.out.println("ch = "+ch);
    }

    private static void testFloating() {
        float f = 1234.5678f;
        System.out.println("float : "+f);
        double dob = 12342098.5678576899d;
        System.out.println("double : "+dob);

        dob = f;
        System.out.println("dob = "+dob);
        f = (float) dob;
        System.out.println("f = "+f);
    }

    private static void testInteger() {
        byte a =  100;
        String a1 = "100";
        Byte bit = Byte.valueOf(a1);
        System.out.println("byte : "+a);
        System.out.println("bit : "+bit);
        short b = 3276;
        Short shot = 894;
        System.out.println("short : "+b);
        b = shot;
        System.out.println("b : "+b);

        int  c = 32768793;
        Integer integer = 100004345;
        System.out.println("int : "+c);
        c = integer;
        System.out.println("integer : "+c);
        long  d = 327687931;
        String str = "12345678";
        Long log = Long.parseLong(str);
        System.out.println("long : "+d);
        System.out.println("log : "+log);
        c= (int)d;
        System.out.println("c : "+c);
        d = c;
        System.out.println("d : "+d);

    }

}
