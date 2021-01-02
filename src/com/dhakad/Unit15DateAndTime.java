package com.dhakad;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Unit15DateAndTime {
    public static void main(String[] args) {
        testDate();
        testDateFormate();
        testSystemDate();
        testGregorianCalendarDemo();
    }

    private static void testGregorianCalendarDemo() {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("\n Month : "+calendar.get(Calendar.JANUARY));
        System.out.println("Date : "+calendar.get(Calendar.DATE));
        System.out.println("Year : "+calendar.get(Calendar.YEAR));
        System.out.println("HH : "+calendar.get(Calendar.HOUR));

    }

    private static void testSystemDate() {
        Long ms = System.currentTimeMillis();
        Date dd = new Date(ms);
        SimpleDateFormat df = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss ");
        System.out.println(df.format(dd));
        // display formatted date
        System.out.printf("%s %tB %<te, %<tY",
                "Due date:", dd);
    }

    private static void testDateFormate() {
        Date currentDate = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss ");
        SimpleDateFormat df = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss ");
        System.out.println(sf.format(currentDate));
        System.out.println(df.format(currentDate));


    }

    private static void testDate() {
        //Date Instance
        Date date = new Date();

        System.out.println(date.toString());
    }
}
