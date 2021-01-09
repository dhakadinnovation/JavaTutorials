package com.dhakad.collections;

import java.util.*;

public class Unit28Collection {
    //1. Vector 2. Dictionary, 3.stack 4. BitSet
    //Interface - 1. List 2. Set 3. Map
    //Classes - 1. ArrayList 2. LinkedList 3. HashSet 4. HashMap

    public static void main(String[] args) {
        testArrayList();
        testList();
        testMap();
        testSet();
    }

    private static void testSet() {

        Set<Integer> rollNo = new HashSet();
        rollNo.add(100);
        rollNo.add(100);
        rollNo.add(100);
        rollNo.add(100);
        rollNo.add(200);

        System.out.println(" roll no "+rollNo);


    }

    private static void testMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("mahi",30);
        map.put("monica",21);
        map.put("ankita",25);
        map.put("ankita",25);
        map.put("raju",31);
        map.put("raju",31);

        System.out.println(" age of raju "+map.get("raju"));
        System.out.println(" key of 31 "+map.get(31));

    }

    private static void testList() {
        // list is a interface
        List list = new ArrayList<String>();
        list.add("Mahi");
        list.add("Monica");
        list.add("Ankita");
        list.add("Raju");
        Collections.sort(list);

        for (Object item : list) {
            System.out.println(" List item : "+item);
        }
    }

    private static void testArrayList() {
        // arraylist is a class
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Mahi");
        arrayList.add("Monica");
        arrayList.add("Ankita");
        arrayList.add("Raju");
        arrayList.add("M");
       /* for (String item: arrayList) {
            System.out.println("ArrayList item : "+item);
        }*/
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println("ArrayList item : "+(String) element);
        }

    }

}
