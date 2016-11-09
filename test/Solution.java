
package com.javarush.test.test;

import java.io.*;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
public class Solution
{
    public  void main(String[] args) throws Exception
    {
        //напишите тут ваш код        //напишите тут ваш код
        Cat cat1 = new Cat();
        cat1.weight = 1;
        cat1.age = 1;
        cat1.strength = 1;

        Cat cat2 = new Cat();
        cat2.weight = 2;
        cat2.age = 2;
        cat2.strength = 2;

        boolean t = cat1.fight(cat2);
        System.out.println(t);

        t = cat2.fight(cat1);
        System.out.println(t);
    }

    public static class Cat
    {
        public String name;
        public int age;
        public int weight;
        public int strength;

        public Cat()
        {
        }

        public boolean fight(Cat anotherCat)
        {
            //напишите тут ваш код

            boolean win = false;

            if ((anotherCat.weight > this.weight) && (anotherCat.strength > this.strength) && (anotherCat.age > this.age))
                win = true;
            else win = false;
            System.out.println(win);
            return win;

        }
    }
}