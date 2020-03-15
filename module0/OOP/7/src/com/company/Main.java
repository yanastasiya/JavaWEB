package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangles=new Triangle(2.5, 5.3,  3.5, 4.5, 6.3, 4.6);
	System.out.println(triangles.calculatePerimetr());
	System.out.println(triangles.calculateSquare());
	triangles.calculateMedianIntersection();
    }
}
