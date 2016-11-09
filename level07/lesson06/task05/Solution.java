package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> strList = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5 ;i++)
        {
            strList.add(i, sc.nextLine());
        }


        for (int i = 0; i<13; i++)
        {
            strList.add(0, strList.get(4));
            strList.remove(5);
        }


        for (int i = 0; i < strList.size();i++)
        {
            System.out.println(strList.get(i));
        }
    }
}
