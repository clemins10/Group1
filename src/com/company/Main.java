package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter sales for Day " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(" Sales for 7 days\n------------------------");
        int totalsales = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println(" Day " + (i + 1) + " Sales " + a[i]);
            totalsales += a[i];
        }
        System.out.println();
        System.out.println("Total sales: " + totalsales);

    }

}
