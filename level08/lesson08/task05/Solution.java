package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {

        HashMap<String, String> hMap = createMap();
//
//        for (Map.Entry<String, String> pair : hMap.entrySet())
//        {
//            System.out.println(pair.getValue());
//        }

        removeTheFirstNameDuplicates(hMap);

        for (Map.Entry<String, String> pair : hMap.entrySet())
        {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> myMap = new HashMap<String, String>();

        myMap.put("Петров","Иван");
        for (int i = 0; i < 9; i++)
        {
            if (i%2 == 0) myMap.put("Сидоров"+i,"Куку"+i);
            else myMap.put("Сидоров"+i,"Куку");
        }


        return myMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        Set<String> set = new HashSet<String>();
        Set<String> duplicates = new HashSet<String>();

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if(!set.add(pair.getValue()))
            {
                duplicates.add(pair.getValue());
            }
        }

        for (String s: duplicates)
        {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
