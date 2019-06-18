package com.company;

public class Main {

    public void tambahPermen(){
        // Deklarasi variabel lokal
        int jumlahPermen = 0;

        jumlahPermen = jumlahPermen + 1;
        System.out.println("Jumlah permen setelah ditambah: "+jumlahPermen);

    }

    public static void main(String[] args) {
	// write your code here
        Main permenSusu = new Main();
        permenSusu.tambahPermen();
    }
}
