package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num > 0) {num = num*2;}
            if (num < 0) {num = num + 1;}

            System.out.println(num);

    }

}