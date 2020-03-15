package com.company;

public class Main1 {
    static void Task1_1(double x, double y){
        System.out.println("Task 1.1");
        double sum = x+y;
        double difference = x-y;
        double composition = x*y;
        double quotient = x/y;
        System.out.println("sum = "+ sum);
        System.out.println("difference = "+difference);
        System.out.println("composition = "+composition );
        System.out.println("quotient = "+quotient);
        System.out.println("______________________________");
    }
    static void Task1_2(double a){
        System.out.println("Task 1.2");
        double c = 3+a;
        System.out.println("c = "+c);
        System.out.println("______________________________");
    }
    static void Task1_3(double x, double y){
        System.out.println("Task 1.3");
        double z;
        z=2*x+(y-2)*5;
        System.out.println("z = "+z);
        System.out.println("______________________________");
    }
    static void Task1_4(double a, double b, double c){
        System.out.println("Task 1.4");
        double z;
        z=((a-3)*b/2)+c;
        System.out.println("z = "+z);
        System.out.println("______________________________");
    }
    static void Task1_5(double x, double y){
        System.out.println("Task 1.5");
        double average=x+y;
        average/=2;
        System.out.println("average = "+average);
        System.out.println("______________________________");
    }
    static void Task1_6(int n, int m){
        System.out.println("Task 1.6");
        double in_one_little_bidon=80/n;
        double in_one_big_bidon= in_one_little_bidon+12;
        double answer = in_one_big_bidon*m;
        System.out.println("answer = "+answer);
        System.out.println("______________________________");
    }
    static void Task1_7(double length){
        System.out.println("Task 1.7");
        double width = length/2;
        double square = width*length;
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_8(double a, double b, double c){
        System.out.println("Task 1.8");
        double answer=((b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
        System.out.println("answer = "+answer);
        System.out.println("______________________________");
    }
    static void Task1_9(double a, double b, double c, double d){
        System.out.println("Task 1.9");
        double answer=a*b/(c*d)-(a*b-c)/(c*d);
        System.out.println("answer = "+answer);
        System.out.println("______________________________");
    }
    static void Task1_10(double x, double y){
        System.out.println("Task 1.9");
        double answer=((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("answer = "+answer);
        System.out.println("______________________________");
    }
    static void Task1_11(double a, double b){
        System.out.println("Task 1.11");
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
        double perimetr= a+b+c;
        double square = a*b;
        System.out.println("perimetr = "+perimetr);
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_12(double x1, double y1, double x2, double y2){
        System.out.println("Task 1.12");
        double x=Math.abs(x1-x2);
        double y=Math.abs(y1-y2);
        double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
        System.out.println("perimetr = "+distance);
        System.out.println("______________________________");
    }
    static void Task1_13(double x1, double y1, double x2, double y2, double x3, double y3){
        System.out.println("Task 1.13");
        double x12=Math.abs(x1-x2);
        double y12=Math.abs(y1-y2);
        double x13=Math.abs(x1-x3);
        double y13=Math.abs(y1-y3);
        double x23=Math.abs(x3-x2);
        double y23=Math.abs(y3-y2);
        double distance12 = Math.sqrt(Math.pow(x12, 2)+Math.pow(y12,2));
        double distance13 = Math.sqrt(Math.pow(x13, 2)+Math.pow(y13,2));
        double distance23 = Math.sqrt(Math.pow(x23, 2)+Math.pow(y23,2));
        double perimetr = distance12+distance13+distance23;
        double half_perimetr = perimetr/2;
        double square = Math.sqrt(half_perimetr*(half_perimetr-distance12)*(half_perimetr-distance13)*(half_perimetr-distance23));
        System.out.println("perimetr = "+perimetr);
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_14(double R){
        System.out.println("Task 1.14");
        final double p=3.14;
        double length=2*p*R;
        double square=p*Math.pow(R,2);
        System.out.println("length = " + length);
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_15(){
        System.out.println("Task 1.15");
        final double p=3.14;
        double second=Math.pow(p,2);
        double third=Math.pow(p,3);
        double fourth=Math.pow(p,4);
        double fives=Math.pow(p,5);
        System.out.println("second: " + second);
        System.out.println("third: "+third);
        System.out.println("fourth: "+fourth);
        System.out.println("fives: "+fives);
        System.out.println("______________________________");
    }
    static void Task1_16(int a){
        System.out.println("Task 1.16");
        int a1=a/1000;
        a%=1000;
        int a2=a/100;
        a%=100;
        int a3=a/10;
        int a4=a%10;
        int compos=a1*a2*a3*a4;
        System.out.println("composition = "+compos);
        System.out.println("______________________________");
    }
    static void Task1_17(double a, double b){
        System.out.println("Task 1.17");
        double average = (Math.pow(a,3)+Math.pow(b,3))/2;
        double geom = Math.sqrt(Math.abs(a)*Math.abs(b));
        System.out.println("average = "+average);
        System.out.println("geometric mean = "+geom);
        System.out.println("______________________________");
    }
    static void Task1_18(double a){
        System.out.println("Task 1.18");
        double square=a*a;
        double all_square = 6*square;
        double volume = square*a;
        System.out.println("square = "+square);
        System.out.println("all square = "+all_square);
        System.out.println("volume = "+volume);
        System.out.println("______________________________");
    }
    static void Task1_19(double a){
        System.out.println("Task 1.19");
        double square = Math.pow(a,2)*Math.sqrt(3)/4;
        double h=a*Math.sqrt(3)/2;
        double r=Math.sqrt(3)*a/6;
        double R=Math.sqrt(3)*a/3;
        System.out.println("square = "+square);
        System.out.println("high = "+h);
        System.out.println("r = "+r);
        System.out.println("R = "+R);
        System.out.println("______________________________");
    }
    static void Task1_20(double length){
        System.out.println("Task 1.20");
        final double p=3.14;;
        double r= length/(2*p);
        double square=p*Math.pow(r,2);
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_21(double R){
        System.out.println("Task 1.21");
        int int_part=(int)(R-(int)R*1000);
        int fractional_part=(int)((int)R/1000.0);
        System.out.println(int_part+"."+fractional_part);
        System.out.println("______________________________");
    }
    static void Task1_22(int T){
        System.out.println("Task 1.22");
        int hour=T/60;
        T%=60;
        if(hour/10==0){
            System.out.println("0"+hour+"ч");
        }
        else{
            System.out.println(hour+"ч");
        }
        int min=T/60;
        T%=60;
        if(min/10==0){
            System.out.print("0"+min+"мин");
        }
        else{
            System.out.print(min+"мин");
        }
        if(T/10==0){
            System.out.print("0"+T+"c");
        }
        else{
            System.out.print(T+"c");
        }
        System.out.println("______________________________");
    }
    static void Task1_23(double r, double R){
        System.out.println("Task 1.23");
        final double p=3.14;
        double square = p*(Math.pow(R,2)-Math.pow(r,2));
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_24(double a, double b, double angle) {
        System.out.println("Task 1.22");
        if (a<b){
        System.out.println("a must be more than b");
        }
        else{
            double d=(a-b)/2;
            double h=b*Math.tan(angle);
            double square = (a+b)*h/2;
            System.out.println("square = "+square);
        }
        System.out.println("______________________________");
    }
    static void Task1_25(double a, double b, double c){
        if (a!=0) {
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D > 0) {
                double x1 = ((-1) * b + Math.sqrt(D)) / (2 * a);
                double x2 = ((-1) * b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            if (D==0){
                double x = ((-1) * b + Math.sqrt(D));
                System.out.println("x = "+x);
            }
            else{
                System.out.println("D<0!!!!");
            }
        }
        else{
        System.out.println("a<0!!!!");
        }
        System.out.println("______________________________");
    }
    static void Task1_26(double a, double b, double y){
        System.out.println("Task 1.26");
        double square = a*b*Math.sin(y)/2;
        System.out.println("square = "+square);
        System.out.println("______________________________");
    }
    static void Task1_27(double a){
        System.out.println("Task 1.27");
        double a2=a*a;
        double a4=a*a*a*a;
        double a8=a4*a4;
        double a10 = a8*a2;
        System.out.println("a^8 = "+a8);
        System.out.println("a^10 = "+a10);
        System.out.println("______________________________");
    }
    static void Task1_28(double angle){
        System.out.println("Task 1.28");
        final double in_deg=57.2958;
        final double in_min=3437.7468;
        final double in_sec=206264.806;
        double deg = angle*in_deg;
        double min = angle*in_min;
        double sec = angle*in_sec;
        System.out.println("in degree: "+deg);
        System.out.println("in minutes: "+min);
        System.out.println("in seconds: "+sec);
        System.out.println("______________________________");
    }
    static void Task1_29(double a, double b, double c){
        System.out.println("Task 1.29");
        final double in_rad=57.2958;
        double cos_cb=(Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c);
        double cos_ab=(Math.pow(b,2)+Math.pow(a,2)-Math.pow(c,2))/(2*b*a);
        double cb=Math.acos(cos_cb);
        double ab=Math.acos(cos_ab);
        double ac=180.0-cb-ab;
        System.out.println("angle between a and b in degrees: "+ab);
        System.out.println("angle between b and c in degrees: "+cb);
        System.out.println("angle between a and c in degrees: "+ac);
        double cb_in_rad=cb/in_rad;
        double ab_in_rad=ab/in_rad;
        double ac_in_rad=ac/in_rad;
        System.out.println("angle between a and b in radians: "+ab_in_rad);
        System.out.println("angle between b and c in radians: "+cb_in_rad);
        System.out.println("angle between a and c in radians:" + +ac_in_rad);
        System.out.println("______________________________");
    }
    static void Task1_30(double R1, double R2, double R3){
        System.out.println("Task 1.30");
        double R = 1/R1+1/R2+1/R3;
        System.out.println("R = "+R);
        System.out.println("______________________________");
    }
    static void Task1_31(double v, double v1, double t1, double t2){
        System.out.println("Task 1.31");
        double s1=v1*t1;
        double v2=v-v1;
        double s2=v2*t2;
        double s= s1+s2;
        System.out.println("s = "+s);
        System.out.println("______________________________");
    }
    static void Task1_32(int m, int n, int k, int p, int q, int r){
        System.out.println("Task 1.32");
        if (m>=0 && m<=23 && n>=0 && n<=59 && k>=0 && k<=59){
            int temp_sec=k+r;
            int temp_min=n+q;
            int temp_hour=m+p;
            if(temp_sec>59){
                temp_sec-=60;
                temp_min+=1;
            }
            if(temp_min>59){
                temp_min-=60;
                temp_hour+=1;
            }
            if(temp_hour>23){
                temp_hour-=24;
            }
            System.out.println(temp_hour+":"+temp_min+":"+temp_sec);
        }
        else {
            System.out.println("violation of time entry rules");
        }
        System.out.println("______________________________");
    }
    static void Task1_33(char symbol){
        System.out.println("Task 1.33");
        int unicod=(int) symbol;
        int unicod_prev=unicod-1;
        int unicod_follow=unicod+1;
        System.out.println("unicod of this symbol: "+unicod);
        System.out.println("unicod of previos symbol: "+unicod_prev);
        System.out.println("unicod of following symbol: "+unicod_follow);
        System.out.println("______________________________");
    }
    static void Task1_34(int A){
        System.out.println("Task 1.34");
        final int in_follow=1024;
        double KB=A/in_follow;
        double MB=KB/in_follow;
        double GB=MB/in_follow;
        double TB=GB/in_follow;
        System.out.println("in KB: "+KB);
        System.out.println("in MB: "+MB);
        System.out.println("in GB: "+GB);
        System.out.println("in TB: "+TB);
        System.out.println("______________________________");
    }
    static void Task1_35(int M, int N){
        System.out.println("Task 1.35");
        double R=M/N;
        int int_part=((int)R*10-(int)R);
        int fractional_part=((int)R%10);
        System.out.println("the leading digit of the fractional part: "+fractional_part);
        System.out.println("the lowest digit of the integer part: "+int_part);
        System.out.println("______________________________");
    }
    static void Task1_36(int number){
        System.out.println("Task 1.36");
        int number4=number%10;
        number/=10;
        int number3=number%10;
        number/=10;
        int number2=number%10;
        number/=10;
        int number1=number%10;
        int comp1=number1*number3;
        int comp2=number2*number4;
        double quotient=comp2/comp1;
        System.out.println("quotient = "+quotient);
        System.out.println("______________________________");
    }
    static void Task1_37_1(int N){
        System.out.println("Task 1.37");
        System.out.println("1)");
        if (N%2==0 && N/10!=0 && N%100==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_2(int N){
        System.out.println("2)");
        int number4=N%10;
        N/=10;
        int number3=N%10;
        N/=10;
        int number2=N%10;
        N/=10;
        int number1=N%10;
        int sum1=number1+number2;
        int sum2=number3+number4;
        if (sum1==sum2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_3(int N) {
        System.out.println("3)");
        int number3=N%10;
        N/=10;
        int number2=N%10;
        N/=10;
        int number1=N%10;
        int sum=number1+number2+number3;
        if (sum%2==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_4(int x, int y, int m, int n) {
        System.out.println("4)");
        if (x>m && x<n){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_5(int n) {
        System.out.println("5)");
        int cub = (int)Math.pow(n,2);
        int number3=n%10;
        n/=10;
        int number2=n%10;
        n/=10;
        int number1=n%10;
        int sum = number1+number2+number3;
        int sum_cub = (int)Math.pow(sum,3);
        if (sum==sum_cub){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_6(int a, int b, int c) {
        System.out.println("6)");
        if (a==b | b==c | a==c){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_7(int n) {
        System.out.println("7)");
        int number3=n%10;
        n/=10;
        int number2=n%10;
        n/=10;
        int number1=n%10;
        int sum1 = number1+number2;
        int sum2 = number3+number2;
        int sum3 = number1+number3;
        if (sum1==sum2 | sum2==sum3 | sum3==sum1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_8(int N, int a) {
        System.out.println("8)");
        while (N>a){
           N/=a;
        }
        if (N==1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static void Task1_37_9(double a, double b, double c, double m, double n) {
        System.out.println("9)");
        if(n==a*m*m+b*m+c){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.println("______________________________");
    }
    static void Task1_38(int x, int y){
        System.out.println("Task 1.38");
        if(x<=y-4 & x>=-y+4 & y<=4 & y>=0){
            System.out.println("a)true");
        }
        else {
            System.out.println("a)false");
        }
        if(x<=2 & x>=-2 & y<=4 & y>=0){
            System.out.println("b)true");
        }
        else {
            if(x<=4 & x>=-4 & y<=0 & y>=-3){
                System.out.println("b)true");
            }
            else{
            System.out.println("b)false");
            }
        }
        if(Math.pow(x,2)+Math.pow(y,2)==16 | Math.pow(x,2)+Math.pow(y,2)==25){
            System.out.println("c)true");
        }
        else {
            System.out.println("c)false");
        }
        System.out.println("______________________________");
    }
    static void Task1_39(double x){
        System.out.println("Task 1.39");
        double answer=x*(x*(x*(2*x-3)+4)-5)+6;
        System.out.println("answer = "+ answer);
        System.out.println("______________________________");
    }
    static void Task1_40(double x){
        System.out.println("Task 1.40");
        double answer1=x*(x*(-4*x+3)-2);
        double answer2=x*(x*(4*x+3)+2)+1;
        System.out.println("answer1 = "+ answer1);
        System.out.println("answer2 = "+ answer2);
        System.out.println("______________________________");
    }

    public static void main(String[] args) {
        Task1_1(2.3, 4.5);
        Task1_2(6.8);
        Task1_3(3.5, 8.35);
        Task1_4(4.765, 7.35, 7.24);
        Task1_5(2.56, 4.64);
        Task1_6(3,6);
        Task1_7(5.6);
        Task1_8(3.5, 7.35, 4.6);
        Task1_9(1.56, 6.34, 6.3, 7.32);
        Task1_10(4.3, 6.32);
        Task1_11(5.7,4.6);
        Task1_12(2.5, 6,7, 3.7);
        Task1_13(2.4, 4.5, 7.3,7.3, 8.2, 1.4);
        Task1_14(4.6);
        Task1_15();
        Task1_16(1234);
        Task1_17(12.5, 35);
        Task1_18(3.5);
        Task1_19(4.6);
        Task1_20(46.4);
        Task1_21(356.642);
        Task1_22(3563);
        Task1_23(3.4, 5.6);
        Task1_24(3.5, 1.4, 35);
        Task1_25(3.5, 6.3, 6.2);
        Task1_26(2.4, 1.6, 36);
        Task1_27(5);
        Task1_28(43);
        Task1_29(2, 3, 4);
        Task1_30(2.4, 5.6, 1.5);
        Task1_31(2.4, 1.2, 4, 5);
        Task1_32(21,42, 34, 1, 64, 24);
        Task1_33((char) 6);
        Task1_34(4);
        Task1_35(2, 4);
        Task1_36(2467);
        Task1_37_1(235);
        Task1_37_2(2345);
        Task1_37_3(543);
        Task1_37_4(4,6, 7, 1);
        Task1_37_5(743);
        Task1_37_6(2,5,4);
        Task1_37_7(359);
        Task1_37_8(2345, 5);
        Task1_37_9(2, 5.5, 2.7, 2.7, 7.1);
        Task1_38(3, 7);
        Task1_39(2.56);
        Task1_40(7.4);
    }
}
