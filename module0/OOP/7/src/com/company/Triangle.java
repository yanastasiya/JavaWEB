package com.company;

public class Triangle {
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        if(checkValidation()==false){
            
        }
    }
    public boolean checkValidation(){
        double[] a=calculateSides();
        if(a[0]+a[1]<a[2] && a[1]+a[2]<a[0] && a[0]+a[2]<a[1]){
            return true;
        }else {
            return false;
        }
    }
    public double[] calculateSides(){
        double[] a =new double[3];
        a[0]=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        a[1]=Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
        a[2]=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
        return a;
    }

    public double calculatePerimetr(){
        double a[]=calculateSides();
        double perimetr=a[0]+a[1]+a[2];
        return perimetr;
    }

    public double calculateSquare(){
        double square;
        double[] a=calculateSides();
        double halfPerimetr=calculatePerimetr()/2;
        square=Math.sqrt(halfPerimetr*(halfPerimetr-a[0])*(halfPerimetr-a[1])*(halfPerimetr-a[2]));
        return square;
    }
    public void calculateMedianIntersection(){
        double x=(x1+x2+x3)/3;
        double y=(y1+y2+y3)/3;
        System.out.println("Coordinates of the median intersection point: x="+x+", y="+y);
    }
}
