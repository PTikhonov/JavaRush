package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код


        Scanner sc = new Scanner(System.in);

        String fstname = sc.nextLine();
        String scdname = sc.nextLine();

        if (fstname.equals(scdname)) {
            System.out.println("Имена идентичны");
        }
        else if ((fstname.length()) == scdname.length())
        {
            System.out.println("Длины имен равны");
        }

    }
}
