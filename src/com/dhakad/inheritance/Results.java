package com.dhakad.inheritance;

public class Results extends Test implements Sports{

    @Override
    public void getScore() {

        System.out.println("Sport score = "+score);
    }

    @Override
    public void setScore(float mScore) {
      //  score =score;
        System.out.println("My Score = "+mScore);
    }

    public static void main(String[] args) {
    Results student1 = new Results();
        student1.setName("Mahi");
        student1.setRollNumber(1000);
        student1.setMarks(100.50f);
        student1.setScore(90.50f);
        student1.getScore();

      //  Test student2 = new Student(); this is not posible
        Student student3 = new Test();
        student3.setName("Ankita");
        student3.setRollNumber(2000);

        Test student4 = new Results();
        student4.setMarks(10.5f);
        student4.setName("Monica");
        student4.setRollNumber(3000);

        Student student5 = new Student();
        student5.setMarks(10.99f);

        Student student6 = new Test();
        student6.setMarks(6.5f);

        Student student7 = new Test();
        student7.setMarks(7.5f);
    }
}
