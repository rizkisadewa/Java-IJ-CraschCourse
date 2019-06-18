package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Masukkan nama anda : ");

        // Instansiasi objek Scanner
        Scanner scanner = new Scanner(System.in);

        // Menyimpan hasil masukkan
        String nama = scanner.next();

        System.out.println("Nama anda adalah : "+nama);

    }
}
