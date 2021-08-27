package week2;

import java.lang.constant.Constable;
import java.util.Arrays;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private int[] big = {1, 3, 5, 7, 8, 10, 12};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Constable isValid() {
        if (!check())
            return (this.year + "년 " + this.month + "월 " + this.day + "일은 유효하지 않은 날짜입니다.");
        else
            return (this.year + "년 " + this.month + "월 " + this.day + "일은 유효한 날짜입니다.");
    }

    private boolean check() {
        if (this.day < 0 || this.month < 0 || this.year < 0)
            return false;

        //31일까지 있는 달
        if (Arrays.binarySearch(this.big, this.month) < 0) {
            if (this.day > 31)
                return false;
        }
        //29일까지 있는 달
        else if (this.month == 2) {
            if (this.day > 29)
                return false;
        }
        //30일까지 있는 달
        else if (Arrays.binarySearch(this.big, this.month) > 0) {
            if (this.day > 30)
                return false;
        }
        if (this.year % 4 == 0){
            if (this.year % 100 == 0 || this.year % 400 != 0) {
                return this.month != 2 || this.day <= 28;
            }
        }
        return true;
    }
}

