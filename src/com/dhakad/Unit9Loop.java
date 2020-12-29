package com.dhakad;

public class Unit9Loop {
    public static void main(String[] args) {
        testWhile();
        Unit9Loop unit9Loop = new Unit9Loop();
        unit9Loop.testDoWhile();
        testFor();
        unit9Loop.testForEach();
    }

    private  void testForEach() {
        //for(initialization : array)
        int[] ints = {10,20,30,40,50};
        String[] data = {"cpp","java","c#","c","kotlin"};
        for (String x :data) {
            System.out.println("for each x= "+x);
        }

        for (int x :ints) {
            System.out.println("for each x= "+x);
        }
        for (int i = 0; i < ints.length; i++) {
            int x = ints[i];
            if(x==20) {
                System.out.println("for x = " + x);
                break;
            }

        }

    }

    private static void testFor() {
        //for(initialize; condition; update)
        int x =10;
        for (int i = 0; i <x ; i++) {
            System.out.println(" i = "+i);
        }
    }

    private void testDoWhile()
    { // do ......while(condition)
        int i = 10;
        int x = 0;
        String[] data = {"cpp","java","c#","c","kotlin"};
       do {
           System.out.println( "do x= "+x);
           x++;
       }while (x>i);

        do {
            System.out.println( "data do x= "+data[x]);
            x++;
        }while (x>data.length);
    }

    private static void testWhile() {
        //while loop (it checks condition first)
        int i = 10;
        int x = 0;
        String[] data = {"cpp","java","c#","c","kotlin"};
        while (x>i){
            System.out.println(" x= "+x);
            x++;
        }

        while (x<data.length){
            System.out.println(" data x= "+data[x]);
            x++;
        }
    }

}
