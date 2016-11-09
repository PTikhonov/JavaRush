package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat cat1 = new Cat("sdf",3,"adsfa");
        Dog dog1 = new Dog("asdf",23,12);
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        String a;
        int b;
        String c;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }


        public Mouse(String a, int b, String c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    //добавьте тут ваши классы

    public static class Cat
    {
        String name;
        int height;
        int tail;


        String a;
        int b;
        String c;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public Cat(String a, int b, String c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        String a;
        int b;
        String c;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }


        public Dog(String a, int b, String c)
        {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }



}
