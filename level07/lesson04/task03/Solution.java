package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] strAr = new String[10];
        int[] intAr = new int[10];

        initializeStrArray(strAr);
        initializeArray(intAr, strAr);

        for (int i = 0; i < intAr.length ; i++)
            System.out.println(Integer.toString(intAr[i]));


    }
    public static int[] initializeArray(int[] ar, String[] strAr) throws IOException
    {
        //Инициализируйте (создайте и заполните) массив тут
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.valueOf(strAr[i].length());
        }

        return ar;
    }

    public static String[] initializeStrArray(String [] strAr) throws IOException
    {
        //Инициализируйте (создайте и заполните) массив тут

        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strAr.length; i++) {
            strAr[i] = reader.readLine();
        }

        return strAr;
    }

}
