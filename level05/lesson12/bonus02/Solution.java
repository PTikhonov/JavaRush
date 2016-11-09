package com.javarush.test.level05.lesson12.bonus02;

import javax.lang.model.type.NullType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        String msg = new String("");

        List<String> stringList = universalStringReader(5);
        List<Integer> intList = StringListToInt(stringList);
        int min = minimum(intList);
        if (min == Integer.MAX_VALUE) msg = "нет элементов в списке";
        else msg = Integer.toString(min);
                //        minimum = universalMin(int[] arr);

//     int minimum = min(23, 24);
        System.out.println("Minimum = " + msg);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

    public static int minimum(List<Integer> intList) //массив должен содержать хотя бы один элемент
    {

        Iterator<Integer> crunchifyIterator = intList.iterator();
        int min;
        if (crunchifyIterator.hasNext()) min = crunchifyIterator.next();
        else return min = Integer.MAX_VALUE;
        while (crunchifyIterator.hasNext())
        {
            int i = crunchifyIterator.next();
            if (i < min) min = i;
        }
        return min;
    }

    public static List<String> universalStringReader(int length) //считывает указанное количество строк
    {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int i = 0;
        List<String> stringList = new ArrayList<String>();
        while (i < length)
        {
            String s = sc.nextLine();
            if (s.length() == 0 || s.trim().equals("")) length++;
            else stringList.add(s);
            i++;
        }
        return stringList;
    }

    public static List<Integer> StringListToInt(List<String> stringList) //конверитурет весь список String в Integer
    {
        List<Integer> intList = new ArrayList<Integer>();

        for(String s : stringList) {
            intList.add(Integer.valueOf(s));
        }

        return intList;
    }

}
