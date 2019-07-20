import java.util.LinkedList;

public class OperasiLinkedList {

    public static void main(String[] args) {
        LinkedList<String> nama = new LinkedList<>();

        nama.addFirst("Anis Yuliana Phasya");
        nama.addFirst("Rizki Sadewa");
        nama.addLast("Zahra Putri Yuliana");
        nama.addLast("Dicky Putra Sadewa");

        System.out.println("List nama setelah addFirst dan addLast");
        System.out.println("===========================");
        for (String name : nama){
            System.out.println(name);
        }

        // coba getFirst dan getLast
        System.out.println("\nNama pertama : "+nama.getFirst());
        System.out.println("\nNama terakhir : "+nama.getLast());

        // coba removeFirst dan removeLast
        nama.removeFirst();
        nama.removeLast();

        System.out.println("\nList nama setelah addFirst dan addLast");
        System.out.println("====================================");
        for (String name : nama){
            System.out.println(name);
        }
    }

}
