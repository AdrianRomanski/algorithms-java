package java_classics.date_and_time;

import java.io.*;
import java.time.LocalDate;

//You are given a date. You just need to write the method, getDay ,
// which returns the day on that date. To simplify your task,
// we have provided a portion of the code in the editor.
//For example, if you are given the date August 14th 2017 the method should return MONDAY
// as the day on that date.
public class GetDay {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString().toUpperCase();
    }

    public static void main(String[] args) throws IOException {

        System.out.println(findDay(8, 5,2015));
    }

}
