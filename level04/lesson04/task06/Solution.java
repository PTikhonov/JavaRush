package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        String msg = "такого дня недели  не существует";
        switch (day)
        {
            case 1: msg = "понедельник";
                break;
            case 2: msg = "вторник";
                break;
            case 3:msg = "среда";
                break;

            case 4:msg = "четверг";
                break;
            case 5: msg = "пятница";
                break;
            case 6:msg = "суббота";
                break;
            case 7:msg = "воскресенье";
                break;
           }
        System.out.println(msg);
    }

}