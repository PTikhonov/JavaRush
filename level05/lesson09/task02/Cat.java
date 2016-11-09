package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    public String Name;
    public int Weight;
    public int Age;
    public String Colour;
    public String Address;

    public Cat(String Name)
    {this.Name = Name;}

    public Cat(String Name, int Weight, int Age)
    {
        this.Name = Name;
        this.Weight = Weight;
        this.Age = Age;
    }


    public Cat(String Name, int Age)
    {
        this.Age = Age;
        this.Name = Name;
        this.Weight = 10;
    }

    public Cat(int Weight, String Colour)
    {
        this.Weight = Weight;
        this.Colour = Colour;
        this.Name = "";
        this.Address = "";
        this.Age = 0;

    }
    public Cat(int Weight, String Colour, String Address)
    {
        this.Weight = Weight;
        this.Colour = Colour;
        this.Address = Address;

    }

}
