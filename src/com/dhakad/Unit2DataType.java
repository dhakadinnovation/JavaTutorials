package com.dhakad;
/*
1. variable
2. types veriable
 2.1 primitive data type
 2.2 non primitive data type

 */
public class Unit2DataType {
    static float mm = 1.0f;
    public static void main(String[] args) {
       // System.out.println("String");
        System.out.println(10);
        testInt(20);
        testFloat(10);
        testBoolean(false);
        testChar();
    }

    private static void testChar() {

        char ch = '&';
        Character mChar = ch;
        System.out.println("ch = "+ch);
        System.out.println("mChar = "+mChar);
    }

    public static void testInt(int i){
        //Integer ->1. byte 2. short 3. int
        // Helper class -> 1.Byte 2. Short 3. Integer

        String value = "100";
        byte b = 10;
        short c = 20;
        int a = 30;

        a  = b;
        c = b;
        a = c;

        c = (short)a;
        a= Integer.parseInt(value);
        String m = Integer.valueOf(a).toString();
        System.out.println("a = "+a);
        System.out.println(i =30);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        //testFloat(10);
    }

    public  static  void testFloat(float f){
        //floating data type 1. float 2. double
       // double f =10; same varibale name issue
        // Helper classes 1.Float 2. Double
        f= 10.678943434567f;
        double d =10.678945353353;
        int a = 10;
         a= (int)f;
         Float ff = f;
         mm = ff;
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);
       // testBoolean(true);
    }
    public  static  void testBoolean(boolean b){
        //boolean data type
        //Helper class -> Boolean
        Boolean bool = b;
        System.out.println(b);
        System.out.println(bool);

    }
}
