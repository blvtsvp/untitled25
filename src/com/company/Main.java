package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер первого массива:");
        int n = in.nextInt();
        System.out.println("Введите размер второго массива:");
        int m = in.nextInt();
        System.out.println("Введите элементы первого массива");
        int[] a = new int[n+m];
        int[] b = new int[n+m];
        for(int i = 0; i <  n;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Введите элементы второго массива");
        for(int i = 0; i < m;i++){
            b[i] = in.nextInt();
        }
        System.out.println("Введите число k от 1 до " + n + ": ");
        int k = in.nextInt();
        int j = 0;
        for(int i = n; i < n+m;i++){
            a[i] = b[j];
            j++;
        }
        j = n;
        for(int i = k; i <= n;i++){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            k++;
            j++;
        }
        for (int i = 0; i <n+m;i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
