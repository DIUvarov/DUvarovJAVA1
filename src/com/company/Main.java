package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задача 6
        /*
        1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        > Выберите что переводить: 1 - масса, 2 - расстояние
                > 2

        2. Пользователю предлагается выбрать единицу измерения. Пример:
        > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
                > 1

        3. Пользователю предлагается ввести количество выбранных единиц:
        > Введите число
        > 10
                > Результат:
                > Метры: 10
                > Мили: 0.006
                > Ярды: 10.94
                > Футы: 32.81

         */
        Scanner scannerConv = new Scanner(System.in);

        int physicalQuantity, unit;
        double number;

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        physicalQuantity = scannerConv.nextInt();

        if (physicalQuantity == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стон, 3 - фунт, 4 - унция");
            unit = scannerConv.nextInt();

            if (unit >= 1 && unit <= 4) {
                System.out.println("Введите число");
                number = scannerConv.nextDouble();

                switch (unit) {
                    case 1:
                        System.out.println("Килограмм: " + number);
                        System.out.println("Стон: " + number / 6.35);
                        System.out.println("Фунт: " + number * 2.205);
                        System.out.println("Унция: " + number * 35.274);
                        break;
                    case 2:
                        System.out.println("Стон: " + number);
                        System.out.println("Килограмм: " + number * 6.35);
                        System.out.println("Фунт: " + number * 14);
                        System.out.println("Унция: " + number * 224);
                        break;
                    case 3:
                        System.out.println("Фунт: " + number);
                        System.out.println("Килограмм: " + number / 2.205);
                        System.out.println("Стон: " + number / 14);
                        System.out.println("Унция: " + number * 16);
                        break;
                    case 4:
                        System.out.println("Унция: " + number);
                        System.out.println("Килограмм: " + number / 35.274);
                        System.out.println("Фунт: " + number / 16);
                        System.out.println("Стон: " + number / 224);
                        break;
                }
            } else {
                System.out.println("Нужно выбрать от 1 до 4");
            }
        } else if (physicalQuantity == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            unit = scannerConv.nextInt();

            if (unit >= 1 && unit <= 4) {
                System.out.println("Введите число");
                number = scannerConv.nextDouble();

                switch (unit) {
                    case 1:
                        System.out.println("Метры: " + number);
                        System.out.println("Мили: " + number / 1609);
                        System.out.println("Ярды: " + number * 1.094);
                        System.out.println("Футы: " + number * 3.281);
                        break;
                    case 2:
                        System.out.println("Мили: " + number);
                        System.out.println("Метры: " + number * 1609);
                        System.out.println("Ярды: " + number * 1760);
                        System.out.println("Футы: " + number * 5280);
                        break;
                    case 3:
                        System.out.println("Ярды: " + number);
                        System.out.println("Метры: " + number / 1.094);
                        System.out.println("Мили: " + number / 1760);
                        System.out.println("Футы: " + number * 3);
                        break;
                    case 4:
                        System.out.println("Футы: " + number);
                        System.out.println("Метры: " + number / 3.281);
                        System.out.println("Мили: " + number / 5280);
                        System.out.println("Ярды: " + number / 3);
                        break;
                }
            } else {
                System.out.println("Нужно выбрать от 1 до 4");
            }
        } else {
            System.out.println("Нужно выбрать 1 или 2");
        }
    }
}