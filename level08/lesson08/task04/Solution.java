package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, Date> mySet = createMap();
        removeAllSummerPeople(mySet);

//        for (Map.Entry<String, Date> pair: mySet.entrySet())
//        {
//            System.out.println(pair.getKey()+" - "+pair.getValue());
//        }


        //напишите тут ваш код
        removeAllSummerPeople(mySet);

        for (Map.Entry<String, Date> pair: mySet.entrySet())
        {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }

    }


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        for (int i = 0; i < 10; i++)
        {
            if (i < 5) map.put("Stallone"+i, new Date("JUNE 1 1980"));
            else map.put("Stallone"+i, new Date("OCTOBER 1 1980"));
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashMap<String, Date> copy= new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair: copy.entrySet() )
        {
            switch (pair.getValue().getMonth())
            {
                case 5: {map.remove(pair.getKey());
                    break;}
                case 6: {
                        map.remove(pair.getKey());
                        break;
                        }
                case 7: {map.remove(pair.getKey());
                    break;}

            }
        }
    }
}
