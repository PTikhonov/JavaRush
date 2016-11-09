package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        //::CODE:
        String msg = "";
        switch (mount)
        {
            case 12:
            case 1:
            case 2: msg = "зима";
                    break;
            case 3:
            case 4:
            case 5: msg = "весна";
                break;
            case 6:
            case 7:
            case 8: msg = "лето";
                break;
            case 9:
            case 10:
            case 11: msg = "осень";
                break;






        }
        System.out.println(msg);
    }
}