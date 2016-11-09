package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human children1 = new Human("John", false, 13, null);
        Human children2 = new Human("Хризантема", false, 13, null);
        Human children3 = new Human("John 3", false, 13, null);

        List<Human> childrens = new ArrayList<Human>();
        childrens.add(children1);
        childrens.add(children2);
        childrens.add(children3);

        Human mother = new Human("Майкл", false, 40, childrens);
        Human father = new Human("Хризантем", true, 44, childrens);

        List<Human> parents1 = new ArrayList<Human>();
        List<Human> parents2 = new ArrayList<Human>();

        parents1.add(mother);
        parents2.add(father);

        Human gm1 = new Human("Ольга", false, 78, parents1);
        Human gm2 = new Human("Василиса", false, 89, parents2);

        Human gf1 = new Human("Петя", true, 78, parents1);
        Human gf2 = new Human("Олег", true, 89, parents2);

        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());

        System.out.println(mother.toString());
        System.out.println(father.toString());

        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(gf1.toString());
        System.out.println(gf2.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        Integer age;
        List<Human> children;


        public Human(String name, Boolean sex, Integer age, List<Human> hm)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (hm != null) this.children = hm;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = 0;

            try
            {
                childCount = this.children.size();
            }
            catch (Exception e)
            {
                childCount = 0;
            }
            finally
            {
                if (childCount > 0)
                {
                    text += ", дети: "+this.children.get(0).name;

                    for (int i = 1; i < childCount; i++)
                    {
                        Human child = this.children.get(i);
                        text += ", "+child.name;
                    }
                }
            }


            return text;
        }
    }

}
