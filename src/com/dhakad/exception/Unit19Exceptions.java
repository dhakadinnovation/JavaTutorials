package com.dhakad.exception;

public class Unit19Exceptions {
    public static void main(String[] args)  {
        testArthmeticException();
        testArrayIndexOutOfBoundsException();
        testFinally();
        try {
            testThrows();
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException in main");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException in main");
        }

        try {
            testNullPointerExceptionByThrow();
        }catch (NullPointerException e){
            System.out.println("NullPointerException in main");
        }


    }

    static void testNullPointerExceptionByThrow()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside testNullPointerExceptionByThrow().");
            throw e; // rethrowing the exception
        }
    }

    private static void testThrows() throws ArithmeticException,ArrayIndexOutOfBoundsException {

        int a = 100;
        int b = 100;
        int [] nums = new int[2];
        nums[2] = 10;
        float c = a/(a-b);

        System.out.println(" c = "+c);


    }

    private static void testArrayIndexOutOfBoundsException() {
        int [] nums = new int[5];
        int c = 0;
       try {
           nums[0] = 10;
           nums[1] = 10;
           nums[2] = 10;
           nums[3] = 10;
           nums[4] = 10;
           c = nums[4]/(nums[3]-nums[2]);
           nums[5] = 10;
       }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
           System.out.println("ArrayIndexOutOfBoundsException");
       }
       catch (ArithmeticException e)
       {
           //e.printStackTrace();
           System.out.println("ArithmeticException");
           try {
               int a = 100;
               System.out.println( "a = "+a);
           }catch (Exception e1){
               System.out.println("Exception");
           }
       }

    }

    private static void testArthmeticException() {
        int a = 100;
        int b = 100;
        int [] nums = new int[2];
        try
        {
            nums[2] = 10;
            float c = a/(a-b);
            System.out.println(" c = "+c);


        }catch (ArithmeticException e){
            System.out.println("ArithmeticException "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
        System.out.println(" a = "+a);

    }

    private static void testFinally() {
        int a = 100;
        int b = 100;
        int [] nums = new int[2];
        try
        {
            nums[2] = 10;
            float c = a/(a-b);
            System.out.println(" c = "+c);

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException "+e.getMessage());
        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }finally {
            System.out.println("I am in finally ");
        }
        System.out.println(" a = "+a);

    }
}
