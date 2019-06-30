package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] peopleData = new String[3][2];

        peopleData[0][0] = "Rizki Sadewa";
        peopleData[0][1] = "Bandung";

        peopleData[1][0] = "Anis Yuliana";
        peopleData[1][1] = "Tanggerang Selatan";

        peopleData[2][0] = "Evan";
        peopleData[2][1] = "Cileunyi";

        // For Accessing the row
        for (int i=0;i<3;i++){
            // For Access the column
            for (int k=0;k<2;k++){
                System.out.print(peopleData[i][k]+" ");
            }
            System.out.println();
        }

    }
}
