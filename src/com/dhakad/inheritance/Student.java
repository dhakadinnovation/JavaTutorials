package com.dhakad.inheritance;

public class Student {
    String name;
    int rollNumber;
    float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name : "+name);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        System.out.println("Roll no : "+rollNumber);
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
        System.out.println("marks form parent : "+marks);
    }
}
