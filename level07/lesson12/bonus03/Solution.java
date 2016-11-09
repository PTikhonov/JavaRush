package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = 20;

        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(String.valueOf(x));
        }
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i; j > -1; j--)
            {
                if (array[j+1] > array[j])
                {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
