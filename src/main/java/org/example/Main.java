package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Дано уравнение: (10+12)*x=88;. Найти значение x
        int x;
        x = 88 / 10 + 122;
        System.out.println(x);
        System.out.println("****************************************");
//        Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
//        Результат выведите в косноль
        Scanner in=new Scanner (System.in);
        System.out.println("Введите x");
        int x1=in.nextInt();
        System.out.println ("Введите у");
        int y=in.nextInt();
        System.out.println("Введите z");
        int z =in.nextInt();
        x1+=y;
        y*=z;
        System.out.println(x1 + " "+y);
        System.out.println("****************************************");
        //5. Дано уравнение 213/x+258/x+60=217
        int sum1 = 213 + 258;
        int sum2 = 217 - 60;
        double x2 = (double) sum1 / sum2;
        System.out.println("x2: " + x2);
        System.out.println("****************************************");
        /* 6. Даны значения: x2 =5; y=2; c= x2 *y;
         * 6.2 Расставьте операции инкремента декремента так,
         * чтобы после выполнения операции (c= x2 *y) с=10; x2 =6; y=1*/
        int x3 = 5;
        int y = 2;
        int c;
        c = ++x3 * y--;
        System.out.println("c =" + c + " x3 =" + x3 + " y =" + y);
        System.out.println("****************************************");
//        1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную. Иначе если a=b  вывести сумму этих чисел.
//        Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        if (a > b) {
            int c2 = a - b;
            System.out.println(c2);
        } else if (a == b) {
            int d = a + b;
            System.out.println(d);
        } else {
            int i = b - a;
            System.out.println(i);
        }
        System.out.println("****************************************");
//        2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
//         Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.
        if (a > b & b != 0) {
            System.out.println(a / b);
        } else if (a != 0) {
            System.out.println(b / a);
        } else {
            System.out.println(a + b);
        }
        System.out.println("****************************************");
//3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.
        if (a % 3 == 0) {
            System.out.println("Число" + a + "делится на 3");
        } else {
            System.out.println("Число" + a + "НЕ делится на 3");
        }
    }