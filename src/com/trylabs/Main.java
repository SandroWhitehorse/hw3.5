package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int add;
        int fact=1;

        Scanner scanner = new Scanner(System.in);
        for (int i=1;i<=15;i++){
            System.out.println("Введите элемент програссии под номером "+i);
            fact=fact*i;
          add=scanner.nextInt();
          sum=sum+(i+add)/fact;
        }
        System.out.println("Результат решения формулы суммы:"+sum);
    }
}
