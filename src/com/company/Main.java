package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Саша", 36);
        Woman woman = new Woman("Евгения", 36);
//        Man child = new Man("Акакий", 10);
//        Woman child1 = new Woman("Агафья", 10);
//    child.setAge(10);
//    child1.setAge(10);
//    man.addChild(child);
//    woman.addChild(child1);
//    man.setAge(20);
//    woman.setAge(22);
//    man.setName("Влад");
//    woman.setName("Аня");
        RegistryOffice.married(man, woman);
    }

    public static void minSearch(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Минимальное число - " + min);

    }

    public static int[] search() {
        Scanner scanner = new Scanner(System.in);
        int NUM_VALUES = 10;
        int[] a = new int[NUM_VALUES];
        System.out.println("Введите числа");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static int searchLength(String a) {

        return a.length();
    }

    public static void numberPrint(int a) {
        System.out.println(a);
    }

    public static boolean trueOrFalse(String a, String b) {
        return a.equals(b);
    }

    public static String printWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void numbers(int[] numb) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numb.length - 1; i++) {
                if (numb[i] > numb[i + 1]) {
                    isSorted = false;

                    buf = numb[i];
                    numb[i] = numb[i + 1];
                    numb[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(numb));
    }

    public static int[] chooseMas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив");
//        int numb = scanner.nextInt();
        int[] a = new int[scanner.nextInt()];
        System.out.println("Введите числа для проверки");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static void number(int[] a) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else odd.add(a[i]);
        }
        System.out.println(odd.toString());
        System.out.println(even.toString());
    }

}

