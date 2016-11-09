package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int height;
        int weight;
        int age;
        String name;
        String surname;
        String nick;


        Human(String name)
        {this.name = name;}
        Human (String name, int weight)
        {this.name = name;
        this.weight = weight;}
        Human (String name, int height, int weight)
        {this.name = name;
            this.height = height;
        this.weight = weight;
        }
        Human (String surname, String nick, int height, int weight)
        {this.name = surname;
            this.nick = nick;
            this.height = height;
            this.weight = weight;
        }
        Human (String name, String surname, String nick, int height, int weight)
        {this.name = name;
        this.nick = nick;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        }
        Human (String surname, String nick, int height, int weight, int age)
        {this.name = surname;
            this.nick = nick;
            this.height = height;
            this.weight = weight;
            this.age = age;
        }
        Human (int weight, String name, String nick, int height)
        {   this.name = surname;
            this.nick = nick;
            this.height = height;
            this.weight = weight;
            this.age = 0;
        }

        Human(String name, int age, String nick)
        {this.name = name;
        this.age = 0;
        this.nick =nick;}
        Human (String name, int weight, String nick, int age)
        {this.name = name;
            this.weight = weight;
        age = 0;
        nick = "asd";}
        Human (int height, int weight)
        {this.name = name;
            this.height = height;
            this.weight = weight;
        }


    }
}
