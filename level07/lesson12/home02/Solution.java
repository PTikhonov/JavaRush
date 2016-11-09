package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.valueOf(reader.readLine());
        int M = Integer.valueOf(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();


        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> slist = new ArrayList<String>();
        int j = 0;
        for (int i = 0; j < M; i++)
        {
            list.add(list.get(i));
            list.remove(i);
            i--;
            j = j+1;
        }




        //for (int i = 0; i < M; i++)
        //{
         //   list.remove(i);
        //}


        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }

    }
}
