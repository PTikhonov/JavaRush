package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int sum = 0;

        while(isNumeric(a))
        {
            sum = sum + Integer.parseInt(a);
            a = sc.nextLine();
        }
        if (a.equals("сумма")) System.out.print(sum);


    }

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
