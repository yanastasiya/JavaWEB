package com.company;

public class Main {
    public static void Task1_1(int a[], int k){
        System.out.println("Task 1.1");
        int sum=0;
        for (int i=0;i<a.length; i++){
           if(a[i]%k==0){
               sum+=a[i];
           }
        }
        System.out.println(sum);
        System.out.println("_____________________________");
    }
    public static void Task1_2(int a[]){
        System.out.println("Task 1.2");
        int b[]=new int[a.length] ;
        int t=0;
        for (int i=0;i<a.length; i++){
            if(a[i]==0){
                b[t]=i;
                t++;
            }
        }
        for(int i=0; i<t; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_3(int a[]){
        System.out.println("Task 1.3");
        for (int i=0;i<a.length; i++){
            if(a[i]>0){
                System.out.println("Раньше встречается положительное число");
                return;
            }
            if(a[i]<0){
                System.out.println("Раньше встречается отрицательное число");
                return;
            }
            if (i==a.length-1 && a[i]==0){
                System.out.println("В массиве встречаются только нули");
            }
        }
        System.out.println("_____________________________");
    }
    public static void Task1_4(int a[]){
        System.out.println("Task 1.4");
        for (int i=0;i<a.length-1; i++){
            if(a[i+1]<a[i]){
                System.out.println("Последовательность не является возрастающей");
                return;
            }
        }
        for (int i=0;i<a.length-1; i++){
            if(a[i]!=a[i+1]){
                System.out.println("Последовательность является возрастающей");
                return;
            }
        }
        System.out.println("Последовательность состоит из одинаковых элементов");
        System.out.println("_____________________________");
    }

    public static void Task1_5(int a[]){
        System.out.println("Task 1.5");
        int b[]=new int[a.length] ;
        int t=0;
        for (int i=0;i<a.length; i++){
            if(a[i]%2==0){
                b[t]=a[i];
                t++;
            }
        }
        if(t==0){
            System.out.print("Нет таких чисел");
        }else{
        for(int i=0; i<t; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
    }}
    public static void Task1_6(int a[]){
        System.out.println("Task 1.6");
        int max=a[0], min=a[0], len=0;
        for (int i=0;i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
            len = max-min;
        }
        System.out.println(len);
        System.out.println("_____________________________");
    }
    public static void Task1_7(double a[], double z){
        System.out.println("Task 1.7");
        int zam=0;
        for (int i=0;i<a.length; i++){
            if(a[i]>z){
                a[i]=z;
                zam+=1;
            }
        }
        for (int i=0;i<a.length; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println(zam);
        System.out.println("_____________________________");
    }
    public static void Task1_8(double a[]){
        System.out.println("Task 1.8");
        int negative=0, pozitive=0, zero=0 ;
        for (int i=0;i<a.length; i++){
            if(a[i]>0){
                pozitive+=1;
            }
            if(a[i]<0){
                negative+=1;
            }
            if(a[i]==0){
                zero+=1;
            }
        }
        System.out.println("Отрицательных: "+negative);
        System.out.println("Положительных: "+pozitive);
        System.out.println("Нулевых: "+zero);
        System.out.println("_____________________________");
    }
    public static void Task1_9(double a[]){
        System.out.println("Task 1.9");
        double max=a[0], min=a[0];
        int index_min=0, index_max=0;
        for (int i=0;i<a.length; i++){
            if(a[i]<min){
                min=a[i];
                index_min=i;
            }
            if(a[i]>max){
                max=a[i];
                index_max=i;
            }
        }
        if (index_max==index_min){
            System.out.print("В массиве одинаковые элементы");
        }else{
            a[index_max]=min;
            a[index_min]=max;
        }
        for(int i=0;i<a.length; i++){
        System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_10(int a[]){
        System.out.println("Task 1.10");
        for (int i=0;i<a.length; i++){
            if(a[i]>i){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_11(int a[], int M, int L){
        System.out.println("Task 1.11");
        for (int i=0;i<a.length; i++){
            if(a[i]%M==L){
                System.out.println(a[i]);
            }
        }
        System.out.println("_____________________________");
    }
    public static void Task1_12(double a[]){
        System.out.println("Task 1.12");
        int count=0;
        int temp;
        for (int i=0;i<a.length; i++){
            count=0;
            for(int k=2; k<i; k++){
                temp=i%k;
                if(temp==0){
                    count++;
                }
            }
            if(count==0 ){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_13(int a[], int M, int L, int N){
        System.out.println("Task 1.13");
        for(int i=0; i<a.length; i++){
            if(a[i]>=L && a[i]<=N && a[i]%M==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_14(int a[]){
        System.out.println("Task 1.14");
        int max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("max="+max+", min="+min);
        System.out.println("_____________________________");
    }
    public static void Task1_15(double a[], double c, double d){
        System.out.println("Task 1.15");
        for(int i=0; i<a.length; i++){
            if(a[i]>=c && a[i]<=d){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_16(double a[]){
        System.out.println("Task 1.16");
        double max=Integer.MIN_VALUE;
        int n;
        if(a.length%2==0){
            n=a.length/2;
            double[] arraySum=new double[n];
            for(int i=1; i<=n; i++){
                arraySum[i-1]=a[i-1]+a[a.length-i];
            }
            for(int i=0; i<n; i++){
                if(arraySum[i]>max){
                    max=arraySum[i];
                }
            }
        }else{
            n=a.length/2+1;
            double[] arraySum=new double[a.length/2+1];
            for(int i=0; i<n-1; i++){
                arraySum[i]=a[i]+a[a.length-i];
            }
            arraySum[n]=a[n];
            for(int i=0; i<n; i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
        }
        System.out.println(max);
        System.out.println("_____________________________");
    }
    public static void Task1_17(int a[]){
        System.out.println("Task 1.17");
        double min=Double.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        int count=0;
        int[] copyA=new int[a.length-1];
        for(int i=0; i<a.length; i++){
            if(a[i]!=min){
                copyA[count]=a[i];
                count++;
            }
        }
        for(int i=0; i<count; i++){
            System.out.print(copyA[i]+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void Task1_19(int a[]){
        System.out.println("Task 1.19");
        int res=0;
        int count;
        int[] countArray=new int[a.length];
        for(int i=0; i<a.length; i++){
            count=1;
            for(int k=i+1; k<a.length; k++){
                if(a[i]==a[k]){
                    count++;
                }
            }
            countArray[i]=count;
            if(countArray[i]==countArray[res]){
                if(a[res]>a[i]){
                    res=i;
                }
            }else{
                if(count>countArray[res]){
                    res=i;
                }
            }
        }
        System.out.println(a[res]);
        System.out.println("_____________________________");
    }
    public static void Task1_20(int a[]){
        System.out.println("Task 1.20");
        for(int i=0; i<a.length; i++){
            if(i%2==1){
                a[i]=0;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("_____________________________");
    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5,6};
	    Task1_1(a1, 3);
	    int a2[]={0,3,4,6,1,0,0,8,0};
	    Task1_2(a2);
	    int a3[]={0,0,0};
	    Task1_3(a3);
        int a4[]={0,0,0,0,0,0};
        Task1_4(a4);
        int a5[]={1,4,5,3,7,9,56,3,7,22};
        Task1_5(a5);
        int a6[]={1,4,5,3,7,9,56,3,7,22};
        Task1_6(a6);
        double a7[]={1.3,4.67,5.24,3.678,7.23,9.23,56.34,3.46,7.24,22.1};
        Task1_7(a7, 5.34);
        double a8[]={1,4,5,3,7,9,56,3,7,22};
        Task1_8(a8);
        double a9[]={1,4,5,3,7,9,56,3,7,22};
        Task1_9(a9);
        int a10[]={1,4,5,3,7,9,56,3,7,22};
        Task1_10(a10);
        int a11[]={1,4,5,3,7,9,56,3,7,22};
        Task1_11(a11, 4, 2);
        double a12[]={1,4,5,3,7,9,56,3,7,22};
        Task1_12(a12);
        int a13[]={1,4,5,3,7,9,56,3,7,22};
        Task1_13(a13, 4, 2, 9);
        int a14[]={1,4,5,3,7,9,56,3,7,22};
        Task1_14(a14);
        double a15[]={1,4,5,3,7,9,56,3,7,22};
        Task1_15(a15, 6.3, 8.9);
        double a16[]={1,4,5,3,7,9,56,3,7,22};
        Task1_16(a16);
        int a17[]={1,4,5,3,7,9,56,3,7,22};
        Task1_17(a17);
        //Task1_18();
        int a19[]={1,4,5,3,7,9,56,3,7,22};
        Task1_19(a19);
        int a20[]={1,4,5,3,7,9,56,3,7,22};
        Task1_20(a20);
    }
}
