package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код

    public String Name;
    public int Age;
    public int Weight;
    public String Sex;
    public String Colour;
    public String Address;

    public void initialize(String Name)
    {
        this.Name = Name;
    }

    public void initialize(String Name, int Weight, int Age)
    {
        this.Name = Name;
        this.Weight = Weight;
        this.Age = Age;
    }
    public void initialize(String Name,  int Age)
    {
        this.Name = Name;
        this.Weight = 10;
        this.Age = Age;
    }

    public void initialize(int Weight, String Colour)
    {
        this.Weight = Weight;
        this.Colour = Colour;
    }

    public void initialize(int Weight, String Colour, String Address)
    {
        this.Weight = Weight;
        this.Colour = Colour;
        this.Address = Address;
    }
}
