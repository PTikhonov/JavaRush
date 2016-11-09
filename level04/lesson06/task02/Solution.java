package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x;
        //String msg = "";

        if ( a < b )  {
            x = b;
        }
        else x = a;
         if (x < c) x = c;
        if (x < d) x = d;

        System.out.println(x);
    }
}
