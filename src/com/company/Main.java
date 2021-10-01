package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача 5
          // 1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
          // 2. зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        //пункт 1
        Scanner scannerForCals = new Scanner(System.in);
        double  numFirst = scannerForCals.nextInt();
        String symbol = scannerForCals.next();
        double  numSecond = scannerForCals.nextInt();

        //пункт 2
        switch (symbol) {
            case "+":
                System.out.println(numFirst + numSecond);
                break;
            case "-":
                System.out.println(numFirst - numSecond);
                break;
            case "*":
                System.out.println(numFirst * numSecond);
                break;
            case "/":
                if (numSecond == 0) {
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println(numFirst / numSecond);
                }
                break;
            default:
                System.out.println("Невыполнимая задача");
        }
        }
}

