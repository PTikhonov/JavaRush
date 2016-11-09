package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> mySet = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            mySet.add(i);
        }
        return mySet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        HashSet<Integer> mySet = new HashSet<Integer>();

        for (Integer t: mySet)
        {
            if (t > 10) mySet.remove(t);
        }

        return mySet;
    }
}
