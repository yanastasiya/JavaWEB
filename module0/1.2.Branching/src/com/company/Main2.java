package com.company;

import java.util.Scanner;

public class Main2 {

    static void Task2_1(double x, double y){
        System.out.println("Task 2.1");
        if (x<y){
            System.out.println("7");
        }
        else{
            System.out.println("8");
        }
        System.out.println("______________________________");
    }
    static void Task2_2(double x, double y){
        System.out.println("Task 2.2");
        if(x<y){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("______________________________");
    }
    static void Task2_3(double a){
        System.out.println("Task 2.3");
        if(a<3){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("______________________________");
    }
    static void Task2_4(double a, double b){
        System.out.println("Task 2.4");
        if(a==b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("______________________________");
    }
    static void Task2_5(double a, double b){
        System.out.println("Task 2.5");
        if(a<b){
            System.out.println("a");
        }
        else {
            if(a==b){
                System.out.println("a=b");
            }
            else{
            System.out.println("b");}
        }
        System.out.println("______________________________");
    }
    static void Task2_6(double a, double b){
        System.out.println("Task 2.6");
        if(a>b){
            System.out.println("a");
        }
        else {
            if(a==b){
                System.out.println("a=b");
            }
            else{
                System.out.println("b");}
        }
        System.out.println("______________________________");
    }
    static void Task2_7(double a, double b, double c, double x){
        System.out.println("Task 2.7");
        double answer = a*x*x+b*x+c;
        System.out.println("answer = "+answer);
        System.out.println("______________________________");
    }
    static void Task2_8(double a, double b){
        System.out.println("Task 2.8");
        double a2 = a*a;
        double b2=b*b;
        if(a2>b2){
            System.out.println("a^2");
        }
        else {
            if(a2==b2){
                System.out.println("a^2=b^2");
            }
            else{
                System.out.println("b^2");}
        }
        System.out.println("______________________________");
    }
    static void Task2_9(double a, double b, double c, double d){
        System.out.println("Task 2.9");
        if (a==b & b==c & a==c){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("______________________________");
    }
    static void Task2_10(double r1, double r2){
        System.out.println("Task 2.10");
        final double p=3.14;
        double s1= p*r1*r1;
        double s2= p*r2*r2;
        if (s1<s2){
            System.out.println("first");
        }
        else{
            if(s1==s2){
                System.out.println("equal");
            }
            else{
            System.out.println("second");}
        }
        System.out.println("______________________________");
    }
    static void Task2_11(double a1, double b1, double y1, double a2, double b2, double y2){
        System.out.println("Task 2.11");
        double square1 = a1*b1*Math.sin(y1)/2;
        double square2 = a2*b2*Math.sin(y2)/2;
        if (square1<square2){
            System.out.println("first");
        }
        else{
            if(square1==square2){
                System.out.println("equal");
            }
            else{
                System.out.println("second");}
        }
        System.out.println("______________________________");
    }
    static void Task2_12(double a, double b, double c){
        System.out.println("Task 2.12");
        if (a>=0){
            a*=a;
        }
        else {
            a=a*a*a*a;
        }
        if (b>=0){
            b*=b;
        }
        else {
            b=b*b*b*b;
        }
        if (c>=0){
            c*=c;
        }
        else {
            c=c*c*c*c;
        }
        System.out.println("first: "+a);
        System.out.println("second: "+b);
        System.out.println("third: "+c);
        System.out.println("______________________________");
    }
    static void Task2_13(double x1, double y1, double x2, double y2){
        System.out.println("Task 2.13");
        double distance1 = Math.sqrt(Math.pow(x1, 2)+Math.pow(y1,2));
        double distance2 = Math.sqrt(Math.pow(x2, 2)+Math.pow(y2,2));
        if (distance1<distance2){
            System.out.println("first");
        }
        else{
            if(distance1==distance2){
                System.out.println("equal");
            }
            else{
                System.out.println("second");}
        }
        System.out.println("______________________________");
    }
    static void Task2_14(double x, double y){
        System.out.println("Task 2.14");
        if (x+y<180){
            System.out.println("there is such a triangle");
            if (x==90 | y==90 | (x+y)==90){
                System.out.println("right triangle");
            }
            else{
                System.out.println("no right triangle");
            }
        }
        else{
            System.out.println("there is no such a triangle");
        }
        System.out.println("______________________________");
    }
    static void Task2_15(double x, double y){
        System.out.println("Task 2.15");
        double litle = (x+y)/2;
        double big = 2*x*y;
        if(x<y){
            x=litle;
            y=big;
        }
        else{
            x=big;
            y=litle;
        }
        System.out.println(x + "   "+y);
        System.out.println("______________________________");
    }
    static void Task2_16(double x, double y){
        System.out.println("Task 2.16");
       if(x==0){
           System.out.println("point is located on the axis x");
       }
        if(y==0){
            System.out.println("point is located on the axis y");
        }
        if(x>0 & y>0){
            System.out.println("point is located on the 1 coordinate angle");
        }
        if(x<0 & y>0){
            System.out.println("point is located on the 2 coordinate angle");
        }
        if(x<0 & y<0){
            System.out.println("point is located on the 3 coordinate angle");
        }
        if(x>0 & y<0){
            System.out.println("point is located on the 4 coordinate angle");
        }
        System.out.println("______________________________");
    }
    static void Task2_17(int m, int n){
        System.out.println("Task 2.17");
        if (m!=n){
            if(m>n){
                n=m;
            }
        }
        else{
            m=0;
            n=0;
        }
        System.out.println(m+"   "+n);
        System.out.println("______________________________");
    }
    static void Task2_18(double a, double b, double c){
        System.out.println("Task 2.18");
        int counter=0;
        if (a<0){counter+=1;}
        if (b<0){counter+=1;}
        if (c<0){counter+=1;}
        System.out.println(counter);
        System.out.println("______________________________");
    }
    static void Task2_19(double a, double b, double c){
        System.out.println("Task 2.19");
        int counter=0;
        if (a>0){counter+=1;}
        if (b>0){counter+=1;}
        if (c>0){counter+=1;}
        System.out.println(counter);
        System.out.println("______________________________");
    }
    static void Task2_20(double a, double b, double c){
        System.out.println("Task 2.20");
        if (a%2==0){System.out.println(a+"is divider");}
        if (b%2==0){System.out.println(b+"is divider");}
        if (c%2==0){System.out.println(c+"is divider");}
        System.out.println("______________________________");
    }

    static void Task2_21(){
      System.out.println("Task 2.21");
        System.out.println("Кто ты: девочка или мальчик?Введи Д или М.");
        Scanner in =new Scanner(System.in);
        String male=in.next();
        if (male =="Д"){
            System.out.println("Мне нравятся девочки!");
        }
        else {
            System.out.println("Мне нравятся мальчики!");
        }
        System.out.println("________________________________");
    }
    static void Task2_22(int x, int y){
        System.out.println("Task 2.22");
        if(x<y){
            int temp=x;
            x=y;
            y=temp;
        }
        System.out.println(x + "     "+y);
        System.out.println("______________________________");
    }
    static void Task2_23(){
        System.out.println("Task 2.23");
        System.out.println("Введи дату(сначала число, затем месяц через пробел)");
        Scanner sc =new Scanner(System.in);
        int day=sc.nextInt();
        int mounth=sc.nextInt();
        if ((mounth==1 || mounth==3 || mounth==5 || mounth==7 || mounth==9 || mounth==11) && day>=1 && day<=31){
            System.out.println("Дата введена верно");
        }
        else{
            if(mounth==2 && day>=1 && day<=28){
                System.out.println("Дата введена верно");
            }
            else {
                if ((mounth==1 || mounth==3 || mounth==5 || mounth==7 || mounth==9 || mounth==11) && day>=1 && day<=30){
                    System.out.println("Дата введена верно");
                }
                else{
                    System.out.println("Дата введена не верно");
                }
            }
        }
        System.out.println("________________________________");
    }
    static void Task2_24(int n) {
        System.out.println("Task 2.24");
        int counter = 0;
        while(n>0){
            n-=1;
            counter+=1;
        }
        if (counter%2!=0){
            System.out.println("любит");
        }
        else {
            System.out.println("не любит");
        }
        System.out.println("______________________________");
    }
    static void Task2_25(double t){
        System.out.println("Task2_25");
        if (t>60){
            System.out.println("Пожароопасная ситуация");
        }
        else {
            System.out.println("нет пожароопасной ситуации");
        }
        System.out.println("______________________________");
    }
    static void Task2_26(double a, double b, double c){
        System.out.println("Task 2.26");
        double max=0, min=0;
        if (a>b & a>c){max=a;}
        if (b>c & b>a){max=b;}
        if (c>b & c>a){max=c;}
        if (a<b & a<c){min=a;}
        if (b<c & b<a){min=b;}
        if (c<b & c<a){min=c;}
        System.out.println("the biggest: "+max);
        System.out.println("the smallest: "+min);
        System.out.println("______________________________");
    }
    static void Task2_27(double a, double b, double c, double d){
        System.out.println("Task 2.27");
        double min1=0, min2=0, max=0;
        if (a<b){min1=a;}
        if(c<d){min2=a;}
        if (min1>min2){
            max=min1;
        }
        else{
            max=min2;
        }
        System.out.println(max);
        System.out.println("______________________________");
    }
    static void Task2_28(double a, double b, double c, double d){
        System.out.println("Task 2.28");
        if (a==d | b==d | c==d) {
            if (a == d) {
                System.out.println("a=d");
            }
            if (b == d) {
                System.out.println("b=d");
            }
            if (c == d) {
                System.out.println("c=d");
            }
        }
        else {
            double max=0;
            double da=d-a;
            double db=d-b;
            double dc=d-c;
            if (da>db & da>dc){
                max=da;
            }
            if (db>da & db>dc){
                max=db;
            }
            if (dc>da & dc>db){
                max=dc;
            }
            System.out.println(max);
        }

        System.out.println("______________________________");
    }
    static void Task2_29(double x1, double y1, double x2, double y2, double x3, double y3){
        System.out.println("Task 2.29");
        double a=Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2),2));
        double b=Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2),2));
        double c=Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1),2));
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (s==0){
            System.out.println("Точки лежат на одной прямой");
        }
        else {
            System.out.println("Точки не лежат на одной прямой");
        }
        System.out.println("______________________________");
    }
    static void Task2_30(double a, double b, double c){
        System.out.println("Task 2.30");
        if (a>b & b>c){
            a*=2;
            b*=2;
            c*=2;
        }
        else {
            a=Math.abs(a);
            b=Math.abs(b);
            c=Math.abs(c);
        }
        System.out.println(a+"   "+b+ "    "+c);
        System.out.println("______________________________");
    }
    static void Task2_31(double A, double B, double x, double y, double z){
        System.out.println("Task 2.31");
        if ((A>x && B>y) || (A>x && B>z) || (B>x && A>y) || (B>x && A>z)){
            System.out.println("Кирпич пройдёт");
        }
        else {
            System.out.println("Кирпич не пройдёт");
        }
        System.out.println("______________________________");
    }
    static void Task2_32(int a, int b, int c){
        System.out.println("Task 2.32");
        if (a+b>0 ||  b+c>0 || a+c>0){
            System.out.println("Является");
        }
            else {
                System.out.println("не является");
        }
        System.out.println("______________________________");
    }
    static void Task2_33(int n){
        System.out.println("Task 2.33");
        if(n==9583 || n==1747){
            System.out.println("Доступны модули баз A,B,C");
        }
        if(n==3331 || n==7922){
            System.out.println("Доступны модули баз B,C");
        }
        if(n==9455 || n==8997){
            System.out.println("Доступны модули баз C");
        }
        System.out.println("______________________________");
    }
    static void Task2_34(){
         System.out.println("Task 2.34");
        System.out.println("Введите стоимость книг:");
        Scanner fin =new Scanner(System.in);
        int cost=fin.nextInt();
        System.out.println("Введите внесённую сумму:");
        Scanner fin2 =new Scanner(System.in);
        int sum=fin2.nextInt();
        if (sum==cost){
            System.out.println("спасибо");
        }
        if (sum>cost){
            int dop1=sum-cost;
            System.out.println("возьмите сдачу: "+dop1);
        }
        if(sum<cost){
            int dop2=cost-sum;
            System.out.println("недостаточно: "+dop2);
        }
        System.out.println("______________________________");
    }
    static void Task2_35(int day){
        System.out.println("Task 2.35");
        if (day<=31){System.out.println(day+".01");}
        if(day>=1 && day<=28){System.out.println((day-31)+".02"); }
        if(day>=1 && day<=31){System.out.println((day-59)+".03"); }
        if(day>=1 && day<=30){System.out.println((day-90)+".04"); }
        if(day>=1 && day<=31){System.out.println((day-120)+".05"); }
        if(day>=1 && day<=30){System.out.println((day-151)+".06"); }
        if(day>=1 && day<=31){System.out.println((day-181)+".07"); }
        if(day>=1 && day<=30){System.out.println((day-212)+".08"); }
        if(day>=1 && day<=31){System.out.println((day-242)+".09"); }
        if(day>=1 && day<=30){System.out.println((day-273)+".10"); }
        if(day>=1 && day<=31){System.out.println((day-303)+".11"); }
        if(day>=1 && day<=30){System.out.println((day-334)+".12"); }
        System.out.println("______________________________");
    }
    static void Task2_36(double x){
        System.out.println("Task 2.36");
        double F;
        if(x<=3){
            F=Math.pow(x,2)-3*x+9;
        }
        else {
            F=1/(Math.pow(x,3)+6);
        }
        System.out.println("F(x) = "+F);
        System.out.println("______________________________");
    }
    static void Task2_37(double x){
        System.out.println("Task 2.37");
        double F;
        if(x>=3){
            F=-1*Math.pow(x,2)+3*x+9;
        }
        else {
            F=1/(Math.pow(x,3)-6);
        }
        System.out.println("F(x) = "+F);
        System.out.println("______________________________");
    }
    static void Task2_38(double x){
        System.out.println("Task 2.38");
        double F;
        if(x<=3 && x>=0){
            F=Math.pow(x,2);
        }
        else {
            F=4;
        }
        System.out.println("F(x) = "+F);
        System.out.println("______________________________");
    }
    static void Task2_39(double x){
        System.out.println("Task 2.39");
        double F;
        if(x>=8){
            F=-1*Math.pow(x,2)+x-9;
        }
        else {
            F=1/(Math.pow(x,4)-6);
        }
        System.out.println("F(x) = "+F);
        System.out.println("______________________________");
    }
    static void Task2_40(double x){
        System.out.println("Task 2.40");
        double F;
        if(x<=13){
            F=-1*Math.pow(x,3)+9;
        }
        else {
            F=-3/(x+1);
        }
        System.out.println("F(x) = "+F);
        System.out.println("______________________________");
    }
    public static void main(String[] args) {
        Task2_1(2.3, 4.5);
        Task2_2(6.8, 4.6);
        Task2_3(3.5);
        Task2_4(4.765, 7.35);
        Task2_5(2.56, 4.64);
        Task2_6(3,6);
        Task2_7(5.6, 4.5, 6.3, 6.0);
        Task2_8(3.5, 7.35);
        Task2_9(1.56, 6.34, 6.3, 7.32);
        Task2_10(4.3, 6.32);
        Task2_11(5.7,4.6, 6,3.64,56,64);
        Task2_12(2.5, 6,7);
        Task2_13(2.4, 4.5, 7.3,7.3);
        Task2_14(4.6, 6.34);
        Task2_15(5.2, 3);
        Task2_16(1234, 25.3);
        Task2_17(13, 35);
        Task2_18(3.5, 35.3, 52.3);
        Task2_19(4.6, 3.5, 3.5);
        Task2_20(4.4, 3.53, 2.4);
        Task2_21();
        Task2_22(3, 6);
        Task2_23();
        Task2_24(36);
        Task2_25(35);
        Task2_26(2.4, 1.6, 36);
        Task2_27(5, 5.3, 2.6, 3.7);
        Task2_28(43, 64, 23, 53);
        Task2_29(2, 3, 4, 5, 4, 3);
        Task2_30(2.4, 5.6, 1.5);
        Task2_31(2.4, 1.2, 4, 5, 6.3);
        Task2_32(21,42, 34);
        Task2_33((char) 6);
        Task2_34();
        Task2_35(35);
        Task2_36(2467);
        Task2_37(235);
        Task2_38(3);
        Task2_39(2.56);
        Task2_40(7.4);
    }

}
