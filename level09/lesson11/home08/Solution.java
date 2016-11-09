package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> aList = new ArrayList<int[]>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2};
        int[] a3 = {1,2,3,4};
        int[] a4 = {1,2,3,4,5,3,2};
        int[] a5 = {};
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);

        return aList;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
