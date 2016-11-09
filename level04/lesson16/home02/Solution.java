package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int max;
        int min;
        int mean = a;
        //String msg = "";

        if ( a < b )  {
           max = b;
        }
        else max = a;
        if (max < c) max = c;

        if ( a > b )  {
            min = b;
        }
        else min = a;
        if (min > c) min = c;

        if (a != min && a != min) mean = a;
        if (b != max && b != min) mean = b;
        if (c != max && c != min) mean = c;



        System.out.println(mean);
    }
}
