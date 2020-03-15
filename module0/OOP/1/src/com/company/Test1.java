package com.company;

import java.util.Scanner;

public class Test1 {
    double firstValue;
    double secondValue;

    public Test1(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void Show(){
        System.out.println("Первое число: "+firstValue+ ", второе число: "+secondValue);
    }
    public void correctValue(){
        System.out.println("Какое число вы хотите изменить?");
        System.out.println("   *Если хотите изменить первое число, нажмите 1.");
        System.out.println("   *Если хотите изменить первое число, нажмите 2.");
        Scanner in = new Scanner(System.in);
        int Choice = in.nextInt();
        //double temp;
        if(Choice==1){
            //temp=firstValue;
            System.out.println("Введите новое значение для первого числа: ");
            //Scanner fir = new Scanner(System.in);
            firstValue = in.nextInt();
        }else if(Choice==2){
            //temp=secondValue;
            System.out.println("Введите новое значение для первого числа: ");
            //Scanner fir = new Scanner(System.in);
            secondValue = in.nextInt();
        }else{
            System.out.println("Неправильный ввод данных");
        }
        return;
    }

    public double SumOfValue(){
        double Sum=firstValue+secondValue;
        return Sum;
    }
    public double maxValue(){
       if(firstValue>secondValue){
           return firstValue;
       }else{
           return secondValue;
       }
    }
}
