package com.second.batch;

public class Unit04Opretors {
    public static void main(String[] args) {
        testArthmetic();
        testRelational();
        testBitwise();
        testLogical();
        testAssigment();
        testTernary();
        testInstanceOf();

    }

    private static void testInstanceOf() {
        Unit02Employee emp = new Unit02Employee();
        System.out.println("instance of emp = "+(emp instanceof Unit02Employee));
    }

    private static void testTernary() {
        int a = 10;
        int b = 20;
        int c = (a<b)?a:b;
        System.out.println("c = "+c);
    }

    private static void testAssigment() {
        //=,+=,-=,%=,*=,/=,&=,|=,<<=,>>=, ^=
        int a =10;
        int b= 20;
        int c  = 30;
        System.out.println("a = b "+(a = b));
        System.out.println("a += b "+(a += b));
        System.out.println("a <<= b "+(a <<= b));
    }

    private static void testLogical() {
        //&&, ||, !
        boolean a = true;
        boolean b= false;
        System.out.println("a&&b = " +(a&&b));
        System.out.println("a||b = " +(a||b));
        System.out.println("!a = " +(!a));
    }

    private static void testBitwise() {
        //2^0, 2^1, 2^2 ,2^3 2^4 ,2^5 2^6 2^7
        //1 ,   2 ,   4, 8 , 16 ,32 , 64 , 128,
        int a = 60;//00111100;
        int b = 13; //0000 1101;
        System.out.println("~a = " +(~a));
        System.out.println("a&b = " +(a&b));
        System.out.println("a|b = " +(a|b));
        System.out.println("a^b = " +(a^b));
        System.out.println("a>>2 = " +(a>>2));
    }

    private static void testRelational() {
        //==, !=, <, >, <=, >=
        int a= 10;
        int b  =20;

        if(a==b){
            System.out.println("true");
        }

        System.out.println("equals "+(a==b));
        System.out.println("not equals "+(a!=b));
        System.out.println("< "+(a<b));
        System.out.println(">  "+(a>b));
        System.out.println("<= "+(a<=b));
        System.out.println(">= "+(a>=b));
    }

    private static void testArthmetic() {
        //+,-,*,/,%
        int a = 60;
        int b= 13;
        System.out.println("sum = "+(a+b));
        System.out.println("min = "+(a-b));
        System.out.println("mul = "+(a*b));
        System.out.println("div = "+(a/b));
        System.out.println("plus plus  = "+(a++));
        System.out.println("min min  = "+(b--));
    }

}
