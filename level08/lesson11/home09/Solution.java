package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String date = "JANUARY 1 2020";
        System.out.println(date+ " = "+ isDateOdd(date));
    }

    public static boolean isDateOdd(String date)
    {
        Date dt = new Date(date);
        Date firstDayOfTheYear = (Date)dt.clone();
        firstDayOfTheYear.setMonth(0);
        firstDayOfTheYear.setDate(0);

        long dif = dt.getTime() - firstDayOfTheYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int i = (int)(dif/msDay);
        if (i%2 == 0) return false;
        else return true;


    }
}
