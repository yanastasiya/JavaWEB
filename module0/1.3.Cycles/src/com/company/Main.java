package com.company;
import java.util.Scanner;

public class Main {

    static void Task3_1(){
        System.out.println("Task 3.1");
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("______________________________");
    }
    static void Task3_2(){
        System.out.println("Task 3.2");
        for(int i=5; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("______________________________");
    }
    static void Task3_3(){
        System.out.println("Task 3.3");
        for(int i=1; i<=10; i++){
            System.out.println("3*"+i+"="+3*i);
        }
        System.out.println("______________________________");
    }
    static void Task3_4(){
        System.out.println("Task 3.4");
        int i=2;
        int sum=0;
        while(i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println("sum="+sum);
        System.out.println("______________________________");
    }
    static void Task3_5(double x, double y){
        System.out.println("Task 3.5");
        int i=1;
        int sum=0;
        while(i<=99){
            sum+=i;
            i+=2;
        }
        System.out.println("sum="+sum);
        System.out.println("______________________________");
    }
    static void Task3_6(){
    System.out.println("Task 3.6");
        System.out.println("Введите целое положительное число:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
        for (int i = 1; i<=n; i++){
        sum+=i;
    }
        System.out.println(sum);
        System.out.println("______________________________");}
    static void Task3_7(double a, double b, double h){
        System.out.println("Task 3.7");
        double y;
        while(a<=b){
            if(a>2){
                y=a;
            }
            else{
                y=-a;
            }
            System.out.println(y);
            a+=h;
        }
        System.out.println("______________________________");
    }

    static void Task3_8(double a, double b, double c, double h){
        System.out.println("Task 3.8");
        double y;
        while(a<=b){
            if(a==15){
                y=(a+c)*2;
            }
            else{
                y=(a-c)+6;
            }
            System.out.println(y);
            a+=h;
        }
        System.out.println("______________________________");
    }
    static void Task3_9(){
        System.out.println("Task 3.9");
        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=Math.pow(i,2);
        }
        System.out.println("sum="+sum);
        System.out.println("______________________________");
    }
    static void Task3_10(double x, double y){
        System.out.println("Task 3.10");
        long mult=1;
        for(int i=1; i<=200; i++){
            mult*=Math.pow(i,2);
        }
        System.out.println("mult="+mult);
        System.out.println("______________________________");
    }
    static void Task3_11(){
        System.out.println("Task 3.11");
        long raz=1;
        for(int i=2; i<=200; i++){
            raz-=Math.pow(i,3);
        }
        System.out.println("raz="+raz);
        System.out.println("______________________________");
    }
    static void Task3_12(){
        System.out.println("Task 3.12");
        int a=1;
        long mult=1;
        for(int i=2; i<=10; i++){
            a+=6;
            mult*=a;
        }
        System.out.println(mult);
        System.out.println("______________________________");
    }
    static void Task3_13(){
        System.out.println("Task 3.13");
        double y;
        System.out.println("y   x");
        for(double i=-5; i<=5; i+=0.5){
            y=5-i*i/2;
            System.out.println(y+"   "+i);
        }
        System.out.println("______________________________");
    }
    static void Task3_14(int n){
        System.out.println("Task 3.14");
        double sum=0;
        double temp;
        for(int i=1; i<=n; i++){
            temp=Math.pow(i,-1);
            sum+=temp;
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    static void Task3_15(){
        System.out.println("Task 3.15");
        int sum=0;
        for(int i=0; i<=10;i++){
            sum=(int)(sum+Math.pow(2,i));
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    static void Task3_16(){
        System.out.println("Task 3.16");
        int sum=3;
        long mult=3;
        for(int i=3; i<=10;i++){
            sum+=i;
            mult*=sum;
        }
        System.out.println(mult);
        System.out.println("______________________________");
    }
    static void Task3_17(double a, int n){
        System.out.println("Task 3.17");
        double mult=1;
        for(int i=0; i<=n-1; i++){
            mult*=(a+i);
        }
        System.out.println(mult);
        System.out.println("______________________________");
    }
    static void Task3_18(double e){
        System.out.println("Task 3.18");
        double a=1;
        double sum=0;
        double n=1;
        while(Math.abs(a)>=e){
            sum+=a;
            n+=1;
            a=Math.pow(-1,n-1)/n;
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    static void Task3_19(double e){
        System.out.println("Task 3.19");
        double a=1/2+1/3;
        double sum=0;
        double n=1;
        while(Math.abs(a)>=e){
            sum+=a;
            n+=1;
            a=Math.pow(1/2,n)+Math.pow(1/3,n);
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    static void Task3_20(double e){
        System.out.println("Task 3.20");
        double a=1;
        double sum=0;
        double n=1;
        while(Math.abs(a)>=e){
            sum+=a;
            n+=1;
            a=Math.pow((3*n-2)*(3*n+1),-1);
        }
        System.out.println(sum);
        System.out.println("______________________________");
    }
    static void Task3_21(double a, double b, double h){
        System.out.println("Task 3.21");
        if(a>b){
            System.out.println("a>b!!!");
        }
        System.out.println("x          y");
        double F;
        while(a<=b){
            F=a-Math.sin(a);
            System.out.println(a+"  "+F);
            a+=h;
        }
        System.out.println("______________________________");
    }
    static void Task3_22(double a, double b, double h){
        System.out.println("Task 3.21");
        if(a>b){
            System.out.println("a>b!!!");
        }
        System.out.println("x          y");
        double F;
        while(a<=b){
            F=Math.pow(Math.sin(a),2);
            System.out.println(a+"  "+F);
            a+=h;
        }
        System.out.println("______________________________");
    }
    static void Task3_23(double a, double b, double h){
        System.out.println("Task 3.23");
        if(a>b){
            System.out.println("a>b!!!");
        }
        System.out.println("x          y");
        double F;
        while(a<=b){
            F=1/Math.tan(a/3)+Math.sin(a)/2;
            System.out.println(a+"  "+F);
            a+=h;
        }
        System.out.println("______________________________");
    }
    public static void Task3_24(){
        System.out.println("Task 3.24");
        System.out.println("Введите натуральное число: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int number, newN=0, count=0;
        while(n>0){
            number=n%10;
            if(number%2==0){
                sum+=number;
                newN=newN*10+number;
            }else{
                newN=newN*10+number;
            }
            n/=10;
        }
        System.out.println("Cумма чётнах цифр введённого числа: "+sum);
        System.out.println("Число, цифры которого следуют в обратном порядке: "+newN);
        System.out.println("______________________________");
    }
    public static void Task3_25(){
        System.out.println("Task 3.25");
        System.out.println("Введите натуральное число: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        System.out.println(factorial);
        System.out.println("______________________________");
    }
    public static void Task3_26(){
        System.out.println("Task 3.26");
        System.out.println("Таблица ASCII ");
        for(int i=0; i<256; i+=2){
            System.out.println(i+" - "+(char)i+ "  "+(i+1)+" - "+(char)i);
        }
        System.out.println("______________________________");
    }
    public static void Task3_27(){
        System.out.println("Task 3.27");
        System.out.println("Введите натуральное число m: ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Введите натуральное число n: ");
        int n=sc.nextInt();
        int count=0;
        for (int i=m; i<=n; i++){
            count=0;
            System.out.print("Все делители числа "+i+":");
            for(int j=2; j<i; j++){
                if(i%j==0){
                    System.out.print(j+"  ");
                    count++;
                }
            }
            if(count==0){
                System.out.print("число простое");
            }
            System.out.println();
        }
        System.out.println("______________________________");
    }
    public static void Task3_28(){
        System.out.println("Task 3.28");
        System.out.println("Введите число x: ");
    Scanner sc=new Scanner(System.in);
    double x=sc.nextInt();
        System.out.println("Введите число y: ");
    double y=sc.nextInt();
        System.out.println("Введите операцию(+,-,/,*)");
    String operation=sc.next();
    double z;
        if(operation.equals("+")){
        z=x+y;
        System.out.println(z);
    }else if(operation.equals("-")){
        z=x-y;
        System.out.println(z);
    }else if(operation.equals("*")){
        z=x*y;
        System.out.println(z);
    }else if(operation.equals("/")){
        if(y!=0){
            z=x/y;
            System.out.println(z);
        }else{
            System.out.println("y=0, поэтому нельзя осуществить операцию деления");
        }
    }else {
            System.out.println("Операция введена неправильно");
        }
        System.out.println("______________________________");
}
    public static void Task3_29(){
        System.out.println("Task 3.29");
        System.out.println("Введите натуральное число m: ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println("Введите натуральное число n: ");
        int n=sc.nextInt();
        int[] masN=new int[11];
        for(int i=0; i<=10; i++){
            masN[i]=-1;
        }
        int ost;
        while(n>0){
            ost=n%10;
            if(masN[ost]==-1){
                masN[ost]=1;
            }
            n/=10;
        }
        while(m>0){
            ost=m%10;
            if(masN[ost]!=-1){
                System.out.print(ost+"  ");
            }
            m/=10;
        }
        System.out.println();
        System.out.println("______________________________");
    }
    public static void Task3_31(){
        System.out.println("Task 3.31");
        System.out.println("УГАДЫВАНИЕ 5 ЧИСЕЛ");
        int start=1, finish=15;
        int[] mas=new int[5];
        int[] guessed=new int[5];
        int[] wrongIntroducedNumbers=new int[5];
        int in;
        for(int i=0; i<5; i++){
            mas[i]=start+(int)(Math.random()*finish);
            guessed[i]=-1;
            wrongIntroducedNumbers[i]=-1;
        }
        int countG=0;
        int countUG=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");
        for(int i=0; i<5; i++){
            int copyCountG=countG;
            in=sc.nextInt();
            for(int j=0; j<5; j++){
                if(in==mas[j]){
                    guessed[countG]=in;
                    mas[j]=-1;
                    countG++;
                }
            }
            if(copyCountG==countG) {
                wrongIntroducedNumbers[countUG] = in;
                countUG++;
            }
        }
        System.out.println("Угаданные числа:");
        for(int i=0; i<5; i++){
            if(guessed[i]!=-1){
                System.out.print(guessed[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Неугаданные числа:");
        for(int i=0; i<5; i++){
            if(mas[i]!=-1){
                System.out.print(mas[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Ошибочные числа пользователя:");
        for(int i=0; i<5; i++){
            if(wrongIntroducedNumbers[i]!=-1){
                System.out.print(wrongIntroducedNumbers[i]+" ");
            }
        }
        System.out.println();
        System.out.println("______________________________");
    }
    public static void Task3_33(int n){
        System.out.println("Task 3.33");
        int maxNumber=0;
        while(n>0){
            if(n%10>maxNumber){
                maxNumber=n%10;
            }
            n/=10;
        }
        System.out.println(maxNumber);
        System.out.println("______________________________");

    }
    public static void Task3_34(){
        System.out.println("Task 3.34");
        int n;
        for(int number1=1; number1<=9; number1++){
            for(int number2=0; number2<=9; number2++){
                for(int number3=0; number3<=9; number3++){
                    for(int number4=0; number4<=9; number4++){
                        if(number1+number2+number3+number4==15){
                            n=1000*number1+100*number2+10*number3+number4;
                            System.out.println(n);
                        }
                    }
                }
            }
        }
        System.out.println("______________________________");

    }
    public static void Task3_35(int n){
        System.out.println("Task 3.35");
        int count=0;
        int number;
        while(n>0){
            number=n%10;
            if(number%2==0){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
        System.out.println("______________________________");
    }
    public static void Task3_36(){
        System.out.println("Task 3.36");
        int multiplication;
        int number;
        for(int i=10; i<100; i++){
            for(int j=10; j<100; j++){
                multiplication=i*j;
                number=i*100+j;
                if(number%multiplication==0){
                    System.out.println(i+ " "+j);
                }
            }
        }
        System.out.println("______________________________");
    }
    public static void Task3_37(){
        System.out.println("Task 3.37");
        int first, second;
        for(int i=10; i<100; i++){
            for(int j=10; j<100; j++){
                first=i*100+j;
                second=j*100+i;
                if(first%99==0 && second%49==0){
                    System.out.println(i+ " и "+ j);
                }
            }
        }
        System.out.println("______________________________");
    }
    public static void Task3_38(){
        System.out.println("Task 3.38");
        System.out.println("Введите число, в котором не менее 3 цифр: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=0, curent=0, count=0, counter=0, temp=0;
        while(n>0){
            prev=curent;
            curent=n%10;
            n/=10;
            count++;
            if(count==2){
                temp=curent-prev;
            }
            if(count>2 && temp==curent-prev){
                counter++;
            }
        }
        if(counter==count-2){
            System.out.println("Число образует арифметическую прогрессию");
        }else {
            System.out.println("Число не образует арифметическую прогрессию");
        }
        System.out.println("______________________________");
    }
    public static void Task3_39(){
        System.out.println("Task 3.39");
        for (int i=10; i<100; i++){
            if ((i*7)/100!=0 && (i*7)%100==i){
                System.out.println(i*7);
            }
        }
        System.out.println("______________________________");
    }
    public static void Task3_40(){
        System.out.println("Task 3.40");
        System.out.println("Введите число N: ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count1=0, count2=0;
        int temp;
        for(int i=1; i<=N; i++){
            temp=i;
            while(temp>0){
                if(temp%(temp%10)==0){
                    count1++;
                }
                count2++;
                temp/=10;
            }
            if(count1==count2){
                System.out.println(i);
            }
        }
        System.out.println("______________________________");
    }

    public static void main(String[] args) {
        Task3_1();
        Task3_2();
        Task3_3();
        Task3_4();
        Task3_5(2.56, 4.64);
        Task3_6();
        Task3_7(5.6, 6.5, 1.2);
        Task3_8(3.5, 7.35, 2.1, 1.3);
        Task3_9();
        Task3_10(4.3, 6.32);
        Task3_11();
        Task3_12();
        Task3_13();
        Task3_14(4);
        Task3_15();
        Task3_16();
        Task3_17(1.4, 3);
        Task3_18(0.5);
        Task3_19(0.6);
        Task3_20(0.4);
        Task3_21(3.5, 5.6, 1.2);
        Task3_22(4.6, 10.2, 3.2);
        Task3_23(4.4, 2.3, 1.4);
        Task3_24();
        Task3_25();
        Task3_26();
        Task3_27();
        Task3_28();
        Task3_29();
        //Task3_30();
        Task3_31();
        //Task3_32();
        Task3_33(8355);
        Task3_34();
        Task3_35(357976);
        Task3_36();
        Task3_37();
        Task3_38();
        Task3_39();
        Task3_40();
    }
}
