package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите здесь ваш код
        int N;
        while ((N = Integer.valueOf(reader.readLine())) <= 0) ;
        maximum = Integer.valueOf(reader.readLine());
        for (int i = N - 1; i > 0; i--) {
            int num = Integer.valueOf(reader.readLine());
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println(maximum);
    }
}