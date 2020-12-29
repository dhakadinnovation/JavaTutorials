package com.dhakad;
/*
1. variable
2. types veriable
 2.1 primitive data type
 2.2 non primitive data type

 */
public class Unit2DataType {
    public static void main(String[] args) {
       // System.out.println("String");
        System.out.println(10);
        testInt(20);
        testFloat(10);
        testBoolean(false);
    }

    public static void testInt(int i){
        //Integer ->1. byte 2. short 3. int
        byte b = 10;
        short c = 20;
        int a = 30;

        a  = b;
        c = b;
        a = c;

        System.out.println(i =30);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        //testFloat(10);
    }

    public  static  void testFloat(float f){
        //floating data type 1. float 2. double
       // double f =10; same varibale name issue
        f= 10.678943434567f;
        double d =10.678945353353;
        int a = 10;
         a= (int)f;
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);
       // testBoolean(true);
    }
    public  static  void testBoolean(boolean b){
        //boolean data type
        System.out.println(b);

    }
}
