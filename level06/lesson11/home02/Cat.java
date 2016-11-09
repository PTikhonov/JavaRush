package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;
import java.util.ListIterator;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {

    //public String name;
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {

      //  this.name = name;
        Cat.cats.add(this);
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        //Создай тут 10 котов
       //for (int i = 0; i<10;i++)
       //{
            new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
           new Cat();
        //}

        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        //for (int i = 0; i<10;i++)
        //{

        System.out.println(Cat.cats);

/*
        System.out.println(Cat.cats.get(1));

        System.out.println(Cat.cats.get(2));

        System.out.println(Cat.cats.get(3));

        System.out.println(Cat.cats.get(4));
        System.out.println(Cat.cats.get(5));

        System.out.println(Cat.cats.get(6));

        System.out.println(Cat.cats.get(7));

        System.out.println(Cat.cats.get(8));

        System.out.println(Cat.cats.get(9));
*/

        //}
    }
}
