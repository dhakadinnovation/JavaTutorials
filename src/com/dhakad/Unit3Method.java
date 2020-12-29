package com.dhakad;

public class Unit3Method {
//this is my first program
    /*this a program for java*/
    public Unit3Method(){
        System.out.println(" FirstProgram ");

    }
    public Unit3Method(String name)
    {
        System.out.println(" name "+name);
    }
    public static void main(String[] args) {
        test1();
    }

    public static  void test1()
    {
        System.out.println("test 1");
        test2();
    }

    public static  void test2()
    {
        System.out.println("test 2");
        test3();
    }
    public static  void test3()
    {
        System.out.println("test 3");
        Unit3Method unit3Method = new Unit3Method();
        Unit3Method name =  new Unit3Method("Mahi");
        name.test4();
        name.test5();
    }
    public void test4()
    {
        System.out.println("test 4");
        test5();
    }
    public void test5()
    {
        System.out.println("test 5");
       // test1();
    }
}
