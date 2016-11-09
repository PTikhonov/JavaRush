package com.javarush.test.level08.lesson11.home05;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Character.toUpperCase;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String newName ="";
        for (int i = 0; i < s.length(); i++)
        {
            if (i==0 && s.charAt(i+1) != ' ') newName = newName + Character.toUpperCase(s.charAt(i));
            if (i>0 && s.charAt(i) != ' ' && s.charAt(i-1) != ' ') newName = newName + s.charAt(i);
            if (i>0 && s.charAt(i) != ' ' && s.charAt(i-1) == ' ') newName = newName + Character.toUpperCase(s.charAt(i));
            if (s.charAt(i) == ' ') newName = newName + s.charAt(i);

        }

        System.out.print(newName);



    }


}
