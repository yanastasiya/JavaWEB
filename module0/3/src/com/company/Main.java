package com.company;

import javafx.concurrent.Task;

import java.util.Scanner;

public class Main {
    public static double Task1(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Side1(x1, y1, x2, y2);
        double b = Side1(x3, y3, x2, y2);
        double c = Side1(x1, y1, x3, y3);
        double p = Perimetr1(a, b, c);
        double s = Square1(a, b, c, p);
        //System.out.println(s);
        return s;
    }

    public static double Side1(double x1, double y1, double x2, double y2) {
        double a = 0.0;
        a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return a;
    }

    public static double Perimetr1(double a, double b, double c) {
        double p = 0.0;
        p = a + b + c;
        p /= 2;
        return p;
    }

    public static double Square1(double a, double b, double c, double p) {
        double s = 0.0;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    //-----------------------------------------------------------
    public static void Task2(int a, int b) {
        int NOD, NOK;
        NOD = NOD2(a, b);
        NOK = NOK2(a, b, NOD);
        System.out.println("НОК=" + NOK);
        System.out.println("НОД=" + NOD);
    }

    public static int NOD2(int a, int b) {
        int NOD = 0;
        if (a > b) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    NOD = i;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    NOD = i;
                }
            }
        }
        return NOD;
    }

    public static int NOK2(int a, int b, int NOD) {
        int NOK = 0;
        NOK = a * b / NOD;
        return NOK;
    }

    //------------------------------------------------------
    public static int Task3(int a, int b, int c, int d) {
        int NOD1 = NOD2(a, b);
        int NOD2 = NOD2(c, d);
        int NOD = NOD2(NOD1, NOD2);
        return NOD;
    }

    //------------------------------------------------------
    public static int Task4(int a, int b, int c) {
        int NOD1 = NOD2(a, b);
        int NOK1 = NOK2(a, b, NOD1);
        int NOD = NOD2(NOD1, c);
        int NOK = NOK2(NOK1, c, NOD);
        return NOK;
    }

    //------------------------------------------------------
    public static double Task5(double a, double b, double c) {
        double min = Min(a, b, c);
        double max = Max(a, b, c);
        double sum = min + max;
        return sum;
    }

    public static double Min(double a, double b, double c) {
        double min = 0;
        if (a < b && a < c) {
            min = a;
        } else {
            if (b < a && b < c) {
                min = b;
            } else {
                min = c;
            }
        }
        return min;
    }

    public static double Max(double a, double b, double c) {
        double max = 0;
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > a && b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }

    //-----------------------------------------------------
    public static double Task6(double a) {
        double sTr = SquareTr(a);
        double s = 6 * sTr;
        ;
        return s;
    }

    public static double SquareTr(double a) {
        double s = Math.pow(a, 2) * Math.sqrt(3) / 4;
        return s;
    }

    //--------------------------------------------------
    public static void Task7(int n) {
        if (Validation7(n) == false) {
            return;
        } else {
            double[] x = new double[n / 2];
            double[] y = new double[n / 2];
            double[] a = new double[n];
            addElements(a);
            for (int i = 0; i < a.length; i += 2) {
                for (i += 2; i < a.length; i += 2) {

                }
            }
        }

    }

    public static boolean Validation7(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            System.out.println("n is not validate");
            return false;
        }
    }

    public static double[] addElements(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Введите х:");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        return a;
    }

    //--------------------------------------------------
    public static double Task8(double[] a) {
        double prev = previous(a);
        return prev;
    }

    public static double previous(double[] a) {
        double prev = 0.0;
        double max = 0.0;
        double temp = 0.0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                temp = max;
                max = a[i];
                prev = temp;
            }
        }
        return prev;
    }

    //---------------------------------------------------
    public static void Task9(int a, int b, int c) {
        if (Easy(a, b) && Easy(b, c) && Easy(a, c)) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    public static int Min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean Easy(int a, int b) {
        int min = Min(a, b);
        int count = 0;
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    //---------------------------------------------------
    public static int Task10() {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 1) {
                sum += Factorial(i);
            }
        }
        return sum;
    }

    public static int Factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    //------------------------------------------------------
    public static void Task11(double[] a, int k, int m) {
        double sum = 0;

    }

    //--------------------------------------------------
    public static void Task12(double x, double y, double z, double t) {

    }

    public static void Task13(int N) {
        int count = calculateCount(N);
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = N % 10;
            N/=10;
            System.out.println(a[i]);
        }
        return;
    }

    public static int calculateCount(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }

    public static int Task14(int a, int b) {
        int count1 = calculateCount(a);
        int count2 = calculateCount(b);
        if (count1 > count2) {
            return a;
        } else {
            return b;
        }
    }

    public static void Task15(int K, int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (sumOfNumber(i) == K) {
                count++;
            }
        }
        int[] a = new int[count];
        int r = 0;
        for (int i = 1; i <= N; i++) {
            if (sumOfNumber(i) == K) {
                a[r] = i;
                r++;
                System.out.println(a[r]);
            }
        }
        return;
    }

    public static int sumOfNumber(int a) {
        int count = 0;
        while (a > 0) {
            count += a % 10;
            a /= 10;
            //count++;
        }
        return count;
    }

    public static void Task16(int n) {
        if (Validate16(n)) {
            int k = 2 * n;
            for (int i = n; i <= k - 2; i++) {
                System.out.println(i + "   " + (i + 2));
            }
        }
        return;
    }

    public static boolean Validate16(int n) {
        if (n <= 2) {
            return false;
        } else {
            return true;
        }
    }

    public static void Task17(int k) {
        for(int i=1; i<=k; i++){
            if(ArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean ArmstrongNumber(int a){
        if(Math.pow(sumOfNumber(a), calculateCount(a))==a){
            return true;
        }else{
            return false;
        }
    }

    public static void Task18(int n) {
        for (int i=1; i<=9-n+1; i++){

        }
    }
    public static int lastNumber(int i, int temp){
        int last=0;
        for (int t=i; t<=9-)
        return last;
    }

    public static void Task19() {

    }

    public static int Task20(int a) {
        int count = 0;
        while (a != 0) {
            a = a-sumOfNumber(a);
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("____________________________________");
        System.out.println("Task 1");
        System.out.println(Task1(2.3, 4.2, 6.3, 6.3, 6.2, 7.4));
        System.out.println("____________________________________");
        System.out.println("Task 2");
        Task2(2,5);
        System.out.println("____________________________________");
        System.out.println("Task 3");
        System.out.println(Task3(2, 5, 6, 7));
        System.out.println("____________________________________");
        System.out.println("Task 4");
        System.out.println(Task4(5,7,2));
        System.out.println("____________________________________");
        System.out.println("Task 5");
        System.out.println(Task5(2.5, -1.3, 7.4));
        System.out.println("____________________________________");
        System.out.println("Task 6");
        System.out.println(Task6(13.6));
        System.out.println("____________________________________");
        System.out.println("Task 7");
        //System.out.println(Task7(7));
        System.out.println("____________________________________");
        double[] a={2, 5, 2, 7, 5, 97};
        System.out.println("Task 8");
        System.out.println(Task8(a));
        System.out.println("____________________________________");
        System.out.println("Task 9");
        Task9(2, 5,7);
        System.out.println("____________________________________");
        System.out.println("Task 10");
        System.out.println(Task10());
        System.out.println("____________________________________");
        System.out.println("Task 11");
        //System.out.println(Task11(a,5)); no
        System.out.println("____________________________________");
        System.out.println("Task 12");
        //System.out.println(Task12(2.4, 4.5, 7.3, 4.6));no
        System.out.println("____________________________________");
        System.out.println("Task 13");
        Task13(435);
        System.out.println("____________________________________");
        System.out.println("Task 14");
        System.out.println(Task14(4356, 482));
        System.out.println("____________________________________");
        System.out.println("Task 15");
        Task15(64, 4);
        System.out.println("____________________________________");
        System.out.println("Task 16");
        Task16(8);
        System.out.println("____________________________________");
        System.out.println("Task 17");
        Task17(10);
        System.out.println("____________________________________");
        System.out.println("Task 18");
        Task18();
        System.out.println("____________________________________");
        System.out.println("Task 19");
        Task19();
        System.out.println("____________________________________");
        System.out.println("Task 20");
        System.out.println(Task20(24));
    }
}
