package com.dhakad;

public class Unit17Method {
    int sum;

   public Unit17Method(int a, int b)
    {
        sum = a+b;
    }

    public Unit17Method(int a, int b, int c)
    {
        sum = a+b+c;
    }

    public static void main(String[] args) {
        int result = testSum(10,20);
        System.out.println("sum = "+result);
        double sum1 = testSum(10,20);
        System.out.println("sum1 = "+sum1);

        double sum2 = testSum(10.5d,20.20d);
        System.out.println("sum2 = "+sum2);

        String sum3 = testSum(10.5f,20.20d);
        System.out.println("sum3 = "+sum3);

        Unit17Method t1 = new Unit17Method(30,50);
        System.out.println("sum4 = "+t1.sum);
        Unit17Method t2 = new Unit17Method(10,20,30);
        System.out.println("sum5 = "+t2.sum);

    }

    private static int testSum(int num1, int num2) {
        int sum = num1+num2;
        return sum;
    }
    private static double testSum(double num1, double num2) {
        double sum = num1+num2;
        return sum;
    }

    private static String testSum(float num1, double num2) {
        double sum = num1+num2;
        Double value = sum;
        return value.toString();
    }
}
