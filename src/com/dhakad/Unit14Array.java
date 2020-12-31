package com.dhakad;

import java.util.Arrays;

public class Unit14Array {
    //Array
    public static void main(String[] args) {

        testArray();
        testStringArray();

    }

    private static void testStringArray() {
        String [] mData = new String[10];
        //mData = new String[]{"Mahi", "Geet", "Monika", "ankita"};
        //System.out.println(mData.toString());
        for (int i =0; i<mData.length; i++){
            mData[i] = "Mahi : "+i;
        }
        for (String name:mData) {
            System.out.println( name );
        }
    }

    private static void testArray() {

        int [] nums = {10,20,30,40,50,60,70};
        int [] data = new int[10];
        System.out.println(nums.length);
        System.out.println(data.length);
        for (int i: nums) {
            System.out.println(i);
        }
        for (int i=0;i< nums.length;i++){
            data[i] = nums[i];
        }
        for (int i:data) {
            System.out.println(i);
        }

        System.out.println(Arrays.stream(nums).max());

    }
}
