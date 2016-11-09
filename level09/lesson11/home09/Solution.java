package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> cats = new HashMap<String, Cat>();
        cats.put("Барсик",new Cat("Барсик"));
        cats.put("Барсик1",new Cat("Барсик1"));
        cats.put("Барсик13",new Cat("Барсик13"));
        cats.put("Барсик12",new Cat("Барсик12"));
        cats.put("Барсик123",new Cat("Барсик123"));
        cats.put("Барсик15",new Cat("Барсик15"));
        cats.put("Барсик16",new Cat("Барсик16"));
        cats.put("Барсик17",new Cat("Барсик17"));
        cats.put("Барсик18",new Cat("Барсик18"));
        cats.put("Барсик19",new Cat("Барсик19"));

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();

        for (Map.Entry<String, Cat> pair: map.entrySet())
        {
            cats.add(pair.getValue());
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
