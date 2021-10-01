package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача 4
        /*
        Написать программу, которая будет выполнять следующие действия:
        1. Ввести три числа с клавиатуры x, y, z
        2. Найти и вывести в консоль среднее арифметическое этих чисел.
        3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        */
        //пункт 1
        Scanner scanner = new Scanner(System.in);
        double numX = scanner.nextDouble();
        double numY = scanner.nextDouble();
        double numZ = scanner.nextDouble();
        //пункт 2
        double average = (numX + numY + numZ) / 3;
        System.out.println(average);
        //пункт 3
        double shareAverage = Math.floor(average / 2);
        System.out.println(shareAverage);
        //пункт 4
        if (shareAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}

