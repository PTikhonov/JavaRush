package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        String[] list = initializeArray();

        for (int i = 9; i >=0 ; i--)
            System.out.println(list[i]);
    }

    public static String[] initializeArray() throws IOException
    {
        //Инициализируйте (создайте и заполните) массив тут

        String[] intAr = new String[10];
        BufferedReader reader
                = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intAr.length-2; i++) {
            intAr[i] = reader.readLine();
        }

        return intAr;
    }

}