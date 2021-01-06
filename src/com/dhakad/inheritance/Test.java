package com.dhakad.inheritance;

public class Test extends Student{
    float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        super.setMarks(marks);
        this.marks = marks;
        System.out.println("Marks : "+marks);
    }


}
