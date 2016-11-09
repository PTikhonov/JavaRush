package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    public String Name;
    public int Height;
    public String Colour;

    public void initialize(String Name)
    {
        this.Name = Name;
    }

    public void initialize(String Name, int Height)
    {
        this.Name = Name;
        this.Height = Height;
    }

    public void initialize(String Name, int Height, String Colour)
    {
        this.Name = Name;
        this.Height = Height;
        this.Colour = Colour;
    }

}
