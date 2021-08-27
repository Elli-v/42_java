package week2.main;

import week2.MyDate;

public class MyDateTest {
    public static void main(String[] args){
        MyDate date1 = new MyDate(29, 2, 2044);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2400);
        System.out.println(date2.isValid());
    }
}
