package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int bilangan = 16;

        if (bilangan >= 0){
            System.out.println(bilangan+" adalah bilangan positif");
        } else{
            System.out.println(bilangan+" adalah bilangan negatif");
        }

        System.out.println();

        // percabangan tiga atau lebih
        int nilai = 87;
        if (nilai >= 70){
            System.out.println("Nilai "+nilai+" mendapatkan index A");
        } else if (nilai >= 60){
            System.out.println("Nilai "+nilai+" mendapatkan index B");
        } else if (nilai >= 50){
            System.out.println("Nilai "+nilai+" mendapatkan index C");
        } else {
            System.out.println("Nilai "+nilai+" mendapatkan index D");
        }
    }
}
