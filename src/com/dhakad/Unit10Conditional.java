package com.dhakad;

public class Unit10Conditional {
    //conditional statmemts in java -> 1. if  2.switch
    //citizan example
    static int childAgeLimit = 18;
    static int seniarCitizan = 60;
    static  String citizanCat = "child";

    public static void main(String[] args) {
        int age = 17;
        testIf(age);
        testIfElse(age);
        testIfElseIf(age);
        testSwitch(age);
    }

    private static void testSwitch(int age) {
        //switch
        switch (age)
        {
            case 17:
            case 18:
                citizanCat = "child";
                System.out.println("testSwitch1 : "+citizanCat);
                break;
            case 60:
                citizanCat = "senior";
                System.out.println("testSwitch2 : "+citizanCat);
                break;
            default:
                citizanCat = "young";
                System.out.println("testSwitch3 : "+citizanCat);
                break;

        }

    }

    private static void testIfElseIf(int age) {
        if (age<childAgeLimit){
          citizanCat ="child";
        }else if (age>childAgeLimit && age <seniarCitizan){
            citizanCat ="young";
        }else{
            citizanCat ="senior";
        }
        System.out.println("citizanCat : "+citizanCat);
    }

    private static void testIfElse(int age) {
        //if .....than ....else
        if(age<childAgeLimit)
        {
            citizanCat = "child";
        }else {
            citizanCat = "young";
        }

        System.out.println("citizan cat2 : "+citizanCat);
    }

    private static void testIf(int age) {
        //this is for if
        if(age<childAgeLimit)
            citizanCat = "child";
           // System.out.println("citizan cat : "+citizanCat);

        if(age<seniarCitizan)
            citizanCat = "young";
           // System.out.println("citizan cat : "+citizanCat);

        if(age>seniarCitizan)
            citizanCat = "senior";

        System.out.println("citizan cat : "+citizanCat);

    }
}
