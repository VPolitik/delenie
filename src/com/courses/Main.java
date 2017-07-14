package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a, b;
	int ans;
        System.out.println("Наша программа вычесляет частное двух ваших чисеел!\n Введите число А: ");
        a = in.nextInt();
        System.out.println("Введите число Б: ");
        b = in.nextInt();
        if (b > 0 | b < 0){
            ans = a/b;
            System.out.println("Результат вашего деления = "+ans);
        }
        else
            System.out.println("На ноль делить нельзя. Неверно введенные данные.");
    }
}
