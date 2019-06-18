package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // showing the human data 1
        showingHumanData("Anis","Jakarta");

        System.out.println();

        // showing the human data 2
        showingHumanData("Rizki","Bandung");
    }

    // method
    public static void showingHumanData(String name, String address){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
    }
}
