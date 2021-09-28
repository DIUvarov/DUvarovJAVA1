package com.company;

public class Main {

    public static void main(String[] args) {
	 //Задача 1
        System.out.print("Hello World!");

    //Задача 2
        double d = 3.17543545;
        byte b = 127;
    //Задача 3
        int[] arrNum = {1, 2, 3, 4, 5};

        int firstNum = arrNum[0];
        int lastNum = arrNum[arrNum.length - 1];
        arrNum[0] = lastNum;
        arrNum[arrNum.length -1] = firstNum;

        System.out.println(arrNum[0] + arrNum[arrNum.length / 2]);
    }

}

