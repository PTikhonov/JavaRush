package com.javarush.test.level04.lesson13.task04;

import java.io.*;
import java.util.Scanner;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (i == 0) System.out.print(8);
            }

            if (i > 0) System.out.println(8);
        }

    }
}
