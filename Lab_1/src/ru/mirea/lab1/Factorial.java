package ru.mirea.lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите вычислить:");

        int number = 0,
                 a = 1,
               res = 0;

        number = sc.nextInt();

        for (int m = 1; number + 1 > m; m++){

            a = m * a;
            res = a;

            System.out.println(res);
        }
    }
}
