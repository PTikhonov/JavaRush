package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    //напишите тут ваш код
    public double centerX;
    public double centerY;
    public double radius;
    public double Width;
    public String Colour;


    public Circle(double centerX, double centerY, double radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius, double Width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.Width = Width;
    }

    public Circle(double centerX, double centerY, double radius, double Width, String Colour)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.Width = Width;
        this.Colour = Colour;
    }

}
