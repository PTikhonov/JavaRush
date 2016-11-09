package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    //напишите тут ваш код
    public String Name;
    public int Height;
    public String Colour;

    public Dog(String Name)
    {
        this.Name = Name;
    }

    public Dog(String Name, int Height)
    {
        this.Name = Name;
        this.Height = Height;
    }

    public Dog(String Name, int Height, String Colour)
    {
        this.Name = Name;
        this.Height = Height;
        this.Colour = Colour;
    }

}
