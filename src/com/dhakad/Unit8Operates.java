package com.dhakad;

public class Unit8Operates {
    /*
    Operates->
    1.Arthmetic ->+,-,*,/,++,--

     */
    public static void main(String[] args) {
       arthmeticOpraters();
       relationalOprater();
       bitwiseOperator();
       logicalOprator();
       assignmentOperator();
    }

    private static void assignmentOperator() {
        //=,+=,-=,*=,%=,/=,<<=,>>=, &=,|=
        int a = 10;
        int b= 20;
        int c=0;

        c = a+b;
        System.out.println( "c = "+c);

        //c = c+a;
        c +=a;
        System.out.println( "c +=a "+c);

        c -=a;
        System.out.println( "c -=a "+c);

        c *=a;
        System.out.println( "c *=a "+c);

        c /=a;
        System.out.println( "c /=a "+c);

        c &=a;
        System.out.println( "c &=a "+c);

        c |=a;
        System.out.println( "c |=a "+c);

    }

    private static void logicalOprator() {
        //&&,||, !
        boolean a = true;
        boolean b= false;
        boolean c;

        c = a&&b;
        System.out.println("a&&b = "+c);

        c = a||b;
        System.out.println("a||b = "+c);

        c = !(a&&b);
        System.out.println("a!b = "+c);

    }

    private static void bitwiseOperator() {
     // &,|,^,~,<<,>>,>>>
        int a = 60; // 0011 1100 =
                    // 2^8 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0   =  256+128+64+32+16+8+4+2+1
        int b = 13; // 0000 1101
        //a= 0011 1100
        //b= 0000 1101
        //------------------------
        //c= 0000 1100 =12

        int c = 0;
        c = a&b;
        System.out.println("a&b = "+ c);
        c = a|b;
        System.out.println("a|b = "+ c);

        c = a^b;
        System.out.println("a^b = "+ c);

        c = ~a;
        System.out.println("~c = "+ c);

        c = a<<1; //1111 0000
        System.out.println("c<<2 = "+ c);

        c = a>>1; //0000 1111
        System.out.println("c>>2 = "+ c);

        c = a>>>1; //0000 11111
        System.out.println("c>>>2 = "+ c);

    }

    private static void relationalOprater() {
        int num1 =50;
        int num2 = 100;

        System.out.println("=="+(num1 == num2)); //false
        System.out.println("!="+(num1 != num2)); //true
        System.out.println(">"+(num1 >num2));  //false
        System.out.println(">="+(num1 >=num2)); //false
        System.out.println("< "+(num1 < num2)); //true
        System.out.println("< "+(num1 <= num2)); //true
    }

    private static void arthmeticOpraters() {
        int num1 = 50;
        int num2 = 20;  //Integer
        byte num3 =127; //Byte

        //addition
        System.out.println("sum : "+num1+num2);
        System.out.println("sum : "+(num1+num2));
        System.out.println(num1+num2 +" : sum");

        //minus
        System.out.println("minus : "+(int)(num1-num2));
        System.out.println("minus : "+(num1-num2));
        System.out.println(num1-num2 +" : minus");

        //mul
        System.out.println("mul : "+(int)(num1*num2));
        System.out.println("mul : "+(num1*num2));
        System.out.println(num1*num2 +" : mul");

        //divide
        System.out.println("div : "+(float)(num2/num1));
        System.out.println("div : "+(num2/num1));
        System.out.println(num2/num1 +" : div");

        //++
       // num3++;
        num3 = (byte)((byte)num3+(byte)1);
        System.out.println("increamental : "+num3);

        //--
        num3--;
        System.out.println("decreamental : "+num3);

        //%
        System.out.println(" modular: "+num1%num2);

        short num4 = 25;
        byte num5 = 20;
        num5 = (byte)num4;
        num4 = num3;


    }


}
