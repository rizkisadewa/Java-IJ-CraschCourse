package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] name = new String[4];
        name[0] = "Anis Yuliana Phasya";
        name[1] = "Rizki Sadewa";
        name[2] = "Kinanti Putri Yuliana";
        name[3] = "Baruna Putra Sadewa";

        for (int i=0;i<name.length;i++){
            /* Accessing and showing the array refer to the variable i which is an array index*/
            System.out.println("Name in index ["+i+"] : "+name[i]);
        }

    }
}
