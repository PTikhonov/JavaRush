package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код


        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        sort(arr);

        System.out.println(arr[0] +" "+arr[1]+" "+arr[2]);

    }
    public static void sort (int[] arr)
    {
        for (int min=0; min<arr.length-1; min++)
        {
            int least = min;
            for (int j=min+1; j<arr.length; j++)
            {
                    if(arr[j] > arr[least])
                    {
                        least = j;
                    }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }
    public static void sort(String[] array)
    {
        //напишите тут ваш код
        String temp = "";

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i; j > -1; j--)
            {
                if (isGreaterThan(array[j+1], array[j]))
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }

}
