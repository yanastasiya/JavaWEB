package com.company;

import java.util.Scanner;

public class Main {
    public static void Task1() {
        System.out.println("Task1");
        int[][] a = new int[3][4];
        int count;
        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 0; j < 4; j++) {
                if (count == 0 && j != 3) {
                    a[i][j] = (int) (Math.random() * 2);
                } else if (count == 0 && j == 3) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
                if (a[i][j] == 1) {
                    count++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task2() {
        System.out.println("Task2");
        int[][] a = new int[2][3];
        int count;
        for (int i = 0; i < 2; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task3(int[][] a) {
        System.out.println("Task3");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][0] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[a.length - 1][i] + " ");
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task4(int[][] a) {
        System.out.println("Task4");
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[a.length - 1][i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task5(int[][] a) {
        System.out.println("Task5");
        for (int i = 0; i < a[0].length; i += 2) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }
    public static void Task6(int[][] a) {
        System.out.println("Task6");
        for (int i = 1; i < a[0].length; i += 2) {
            if(a[0][i]>(a[a[0].length-1][i])){
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task7(int[][] a) {
        System.out.println("Task7");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] < 0 && a[i][j] % 2 != 0) {
                    sum += Math.abs(a[i][j]);
                }
            }
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    public static void Task8(int[][] a, int n, int m) {
        System.out.println("Task8");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 7) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
        System.out.println("______________________________");
    }

    public static void Task9(int[][] a) {
        System.out.println("Task9");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task10(int[][] a, int k, int p) {
        System.out.println("Task10");
        System.out.println(k + "я строка:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[k - 1][i] + " ");
        }
        System.out.println();
        System.out.println(p + "й столбец:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i][p - 1] + " ");
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task11(int m, int n, int[][] a) {
        System.out.println("Task11");
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task12(int n) {
        System.out.println("Task12");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
            a[i][i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task13(int n) {
        System.out.println("Task13");
        int[][] a = new int[n][n];
        int count;
        for (int i = 0; i < n; i++) {
            count = n;
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    a[i][j] = j + 1;
                } else {
                    a[i][j] = count;
                    count--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task14(int n) {
        System.out.println("Task14");
        int[][] a = new int[n][n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
            count++;
            a[i][count - 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task15(int n) {
        System.out.println("Task15");
        int[][] a = new int[n][n];
        int count = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
            a[i][i] = count;
            count--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task16(int n) {
        System.out.println("Task16");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
            a[i][i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task17(int n) {
        System.out.println("Task17");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            a[i][0] = 1;
            a[0][i] = 1;
            a[n - 1][i] = 1;
            a[i][n - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task18(int n) {
        System.out.println("Task18");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= n - i - 1) {
                    a[i][j] = i + 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task19(int n) {
        System.out.println("Task19");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i <= j && i < n / 2 && j < n / 2)) {
                    a[i][j] = 1;
                    a[n - i - 1][j] = 1;
                    a[n - i - 1][n - j - 1] = 1;
                    a[i][n - j - 1] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task20(int n) {
        System.out.println("Task20");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i >= j && i < n / 2 && j < n / 2)) {
                    a[i][j] = 1;
                    a[n - i - 1][j] = 1;
                    a[n - i - 1][n - j - 1] = 1;
                    a[i][n - j - 1] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task21(int n) {
        System.out.println("Task21");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        int count;
        for (int i = 0; i<n; i++) {
            count=n;
            for (int j = i; j >=0 ; j--) {
                a[i][j]=count;
                count--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }
    public static void Task22(int n) {
        System.out.println("Task22");
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        int count;
        for (int i = 0; i<n; i++) {
            count=i+1;
            for (int j = 0; j <=n-i-1 ; j++) {
                a[i][j]=count;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task23(int n) {
        System.out.println("Task23");
        double[][] a = new double[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (a[i][j] > 0) {
                    sum += 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }

    public static void Task24(int[] a) {
        System.out.println("Task24");
        int[][] array = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                array[i][j] = (int) Math.pow(a[j], i + 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task26(int n, int m) {
        System.out.println("Task26");
        double[][] a = new double[n][m];
        double[] sumNegative = new double[n];
        double[] maxInLine = new double[n];
        double max = Double.MIN_VALUE;
        int maxI = 0, maxJ = 0;
        double min = Double.MAX_VALUE;
        int minI = 0, minJ = 0;
        for (int i = 0; i < n; i++) {
            sumNegative[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы матрицы размерностью" + n + "*" + m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] < 0) {
                    sumNegative[i] += a[i][j];
                }
                if (a[i][j] > maxInLine[i]) {
                    maxInLine[i] = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if (a[i][j] < min) {
                    min = a[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        double temp = a[minI][minJ];
        a[minI][minJ] = a[maxI][maxJ];
        a[maxI][minJ] = temp;
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " строка");
            System.out.println("a)" + sumNegative[i]);
            System.out.println("б)" + maxInLine[i]);
            System.out.println();
        }
        System.out.println("Переставить местами максимальный и минимальный элементы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task27(int[][] a) {
        System.out.println("Task27");
        System.out.println("Изначальный массив:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 столбца, которые хотите поменять местами: ");
        int column1 = sc.nextInt();
        int column2 = sc.nextInt();
        int[] temp = new int[a.length];
        for (int i = 0; i < a[0].length; i++) {
            temp[i] = a[i][column1];
            a[i][column1] = a[i][column2];
            a[i][column2] = temp[i];
        }
        System.out.println("После замены:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void Task28(int[][] a) {
        System.out.println("Task28");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] < 0) {
                    System.out.println("Не все элементы положительные!");
                    return;
                }
            }
        }
        int[] sumInColumn = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sumInColumn[i] += a[j][i];
            }
        }
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (sumInColumn[i] > max) {
                max = sumInColumn[i];
                indexMax = i;
            }
        }
        System.out.println("Суммы элементов всех столбцов:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(sumInColumn[i] + " ");
        }
        System.out.println();
        System.out.println("Cтолбец, содержащий максимальную сумму:" + (indexMax + 1));
        System.out.println("______________________________");
    }

    public static void Task29(int[][] a) {
        System.out.println("Task29");
        int[] positive = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            positive[i] = a[i][i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(positive[i] + " ");
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task30() {
        System.out.println("Task30");
        int[][] a = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = (int) (Math.random() * 16);
            }
        }
        int[] counter = new int[10];
        for (int i = 0; i < 10; i++) {
            counter[i] = 0;
            for (int j = 0; j < 20; j++) {
                System.out.print(a[i][j] + " ");
                if (a[i][j] == 5) {
                    counter[i]++;
                }
            }
            System.out.println();
        }
        System.out.println("Номера строк, в которых число 5 встречается 3 и более раз:");
        for (int i = 0; i < 10; i++) {
            if (counter[i] >= 3) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        System.out.println("______________________________");
    }

    public static void Task31() {
        System.out.println("Task31");
        System.out.println("Введите размерность матрицы: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 1000);
                System.out.print(a[i][j] + " ");
                if (a[i][j] / 100 == 0 && a[i][j] / 10 != 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Количество двузначных чисел в матрице: " + count);
        System.out.println("______________________________");
    }
    public static void Task32(int [][] a) {
        System.out.println("Task32");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int b;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] < a[i][j - 1]) {
                    b = a[i][j];
                    a[i][j] = a[i][j - 1];
                    a[i][j - 1] = b;
                }

            }

        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        int[][] a = new int[5][5];
        a[0][0] = 3;
        a[0][1] = 34;
        a[0][2] = 12;
        a[0][3] = 7;
        a[0][4] = 23;
        a[1][0] = 45;
        a[1][1] = 3;
        a[1][2] = 11;
        a[1][3] = 9;
        a[1][4] = 2;
        a[2][0] = 13;
        a[2][1] = 4;
        a[2][2] = 2;
        a[2][3] = 1;
        a[2][4] = 34;
        a[3][0] = 35;
        a[3][1] = 7;
        a[3][2] = -122;
        a[3][3] = -91;
        a[3][4] = 2;
        a[4][0] = 3;
        a[4][1] = 23;
        a[4][2] = 9;
        a[4][3] = 12;
        a[4][4] = 25;
        Task3(a);
        Task4(a);
        Task5(a);
        Task6(a);
        Task7(a);
        Task8(a, 5, 5);
        Task9(a);
        Task10(a, 2, 2);
        Task11(5, 5, a);
        Task12(9);
        Task13(8);
        Task14(6);
        Task15(8);
        Task16(6);
        Task17(4);
        Task18(8);
        Task19(8);
        Task20(8);
        Task21(4);
        Task22(6);
        Task23(8);
        int[] arr;
        arr = new int[]{2, 5, 7, 85, 2};
        Task24(arr);
        //Task25();
        Task26(3, 4);
        Task27(a);
        Task28(a);
        Task29(a);
        Task30();
        Task31();
        Task32(a);
    }
}