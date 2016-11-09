package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
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

    public void initialize(String Name)
    {
        this.Name = Name;
    }

    public void initialize(String Name, int Age)
    {
        this.Name = Name;
        this.Age = Age;
    }
    public void initialize(String Name, int Age, String Sex)
    {
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
    }


}
