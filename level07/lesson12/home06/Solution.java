package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import com.sun.org.apache.xpath.internal.operations.Bool;


public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gd1 = new Human(null, null, "GD1", true, 78);
        Human gd2 = new Human(null, null, "GD2", true, 89);
        Human gm1 = new Human(null, null, "Gm1", false, 87);
        Human gm2 = new Human(null, null, "Gm2", false, 67);
        Human f = new Human(gd1, gm1, "f1", true, 40);
        Human m = new Human(gd2, gm2, "m1", false, 34);

        Human s1 = new Human(f, m, "s1", true,12);
        Human s2 = new Human(f, m, "d1", false, 18);
        Human s3 = new Human(f, m, "s2", true, 5);


        System.out.println(gd1.toString());
        System.out.println(gd2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }

    public static class Human
    {
        //напишите тут ваш код

        //***ничего не было
        public  String name;
        public  Boolean sex;
        public  int age;

        public Human father;
        public Human mother;

        public Human (Human father, Human mother, String name, boolean sex, int age)
        {
            this.father = father;
            this.mother = mother;
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        //***
        public String toString()
        {
            String text = "";

            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
