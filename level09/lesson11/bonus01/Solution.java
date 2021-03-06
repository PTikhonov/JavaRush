package com.javarush.test.level09.lesson11.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);
//fileInputStream.available()>0
        int count = 0;
        int i = -1;
        try
        {
            byte[] buffer = new byte[fileInputStream.available()];
            // считываем буфер
            fileInputStream.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fileOutputStream.write(buffer, 0, buffer.length);

            count=buffer.length;
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
