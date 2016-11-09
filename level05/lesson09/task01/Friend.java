package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    public String Name;
    public int Age;
    public String Sex;

    public Friend(String Name)
    {this.Name = Name;}

    public Friend(String Name, int Age)
    {this.Name = Name;
    this.Age = Age;}


    public Friend(String Name, int Age, String Sex)
    {this.Name = Name;
        this.Age = Age;
    this.Sex = Sex;}



}