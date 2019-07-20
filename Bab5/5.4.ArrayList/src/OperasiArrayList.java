import java.util.ArrayList;

public class OperasiArrayList {

    public static void main(String[] args) {
        // coba operasi add
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Anis Yuliana Phasya");
        nama.add("Rizki Sadewa");
        nama.add("Santika");
        nama.add("Abimanyu Arden");

        System.out.println("List nama setelah operasi add");
        System.out.println("=============================");
        for (String name : nama){
            System.out.println(name);
        }

        // Menyisipkan nama Asep Sugiarto
        nama.add(2, "Asep Sugiarto");

        System.out.println("\nList nama setelah disisipkan nama Asep Sugiarto");
        System.out.println("=============================");
        for (String name : nama){
            System.out.println(name);
        }

        // Coba operasi get untuk mendapatkan nama Anis Yuliana Phasya
        System.out.println("\nHasil operasi get untuk nama di posisi keempat");
        System.out.println("=============================");
        System.out.println(nama.get(3));

        // Coba operasi remove

        nama.remove(0);
        System.out.println("\nList nama setelah nama pertama dihapus");
        System.out.println("=============================");
        for (String name: nama){
            System.out.println(name);
        }

        // coba operasi size
        System.out.println("\nUkuran array list nama: "+nama.size());
    }

}
