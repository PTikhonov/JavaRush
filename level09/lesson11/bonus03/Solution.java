package com.javarush.test.level09.lesson11.bonus03;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);

        array = sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static String[] sort(String[] array)
    {
        //напишите тут ваш код
        ArrayList<Integer> intList= new ArrayList<Integer>();
        ArrayList<String> strList= new ArrayList<String>();

        for (String s : array)
        {
            if (isNumber(s))
            {
                intList.add(Integer.valueOf(s));
            }
            else
            {
                strList.add(s);
            }
        }
        //сорт(список чисел)
        Integer intAr[] = new Integer[intList.size()];
        intAr = intList.toArray(intAr);
        sortInt(intAr);

        //сорт(список строк)
        String strAr[] = new String[strList.size()];
        strAr = strList.toArray(strAr);
        sortStr(strAr);

        String res[] = new String[array.length];

        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                res[i] = String.valueOf(intAr[j]);
                j++;
            }
            else
            {
                res[i] = String.valueOf(strAr[k]);
                k++;
            }
        }

        return res;
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return !(a.compareTo(b) > 0);
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }

    public static void sortInt (Integer[] arr) {
        for (int min=0; min<arr.length-1; min++) {
            int least = min;
            for (int j=min+1; j<arr.length; j++) {
                if(arr[j] > arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }
    public static void sortStr(String[] array)
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
}
