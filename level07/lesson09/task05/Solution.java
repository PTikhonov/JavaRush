package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ;i++)
        {
            list.add(i, sc.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        //Вывести на экран result
        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size() ;i++)
        {
            list.add(i+1,list.get(i));
            i++;
        }
        return list;
    }
}
