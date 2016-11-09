package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args)
    {


        HashMap<String, String> mySet = createMap();
        System.out.println(getCountTheSameFirstName(mySet, "Иван"));
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> mySet = new HashMap<String, String>();

        for (int i = 0; i < 10; i++)
        {
            mySet.put("Петров"+i, "Иван");
        }
        return mySet;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet() )
        {
            if (name.equals(pair.getValue())){count = count + 1;}
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet() )
        {
            if (lastName.equals(pair.getKey())){count = count + 1;}
        }
        return count;
    }
}
