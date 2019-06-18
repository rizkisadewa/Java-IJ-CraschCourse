package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int side = 4;
        System.out.println("Rectangle Area with side "+side+" is "+countingRectangularArea(side));
    }

    public static int countingRectangularArea(int side){
        int area = side * side;
        return area;
    }
}
