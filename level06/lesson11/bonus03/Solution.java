package com.javarush.test.level06.lesson11.bonus03;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        List<String> strList = universalStringReader(5);
        List<Integer> intList = StringListToInt(strList);

        Collections.sort(intList);
        printList(intList);

    }
    //считывает указанное количество строк
    public static List<String> universalStringReader(int length)
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

    //конверитурет весь список String в Integer
    public static List<Integer> StringListToInt(List<String> stringList)
    {
        List<Integer> intList = new ArrayList<Integer>();

        for(String s : stringList) {
            intList.add(Integer.valueOf(s));
        }

        return intList;
    }

    public static void printList(List<Integer> intList)
    {
        for(int s : intList) {
            System.out.println(Integer.valueOf(s));
        }

    }

}
