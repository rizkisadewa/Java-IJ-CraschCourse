import java.util.PriorityQueue;

public class OperasiPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<String> nama = new PriorityQueue<>();

        // coba operasi offer
        nama.offer("Rizki Sadewa");
        nama.offer("Anis Yuliana Phasya");
        nama.offer("Zahra Putri Yuliana");
        nama.offer("John Doe");

        // untuk membuktikan bahwa nama yg di-peek tidak bilang
        System.out.println("\nList nama setelah operasi offer");
        System.out.println("==================================");
        for (String name : nama){
            System.out.println(name);
        }


        // coba operasi peek
        System.out.println(nama.peek());

        // untuk membuktikan bahwa nama yg di-peek tidak bilang
        System.out.println("\nList nama setelah operasi peek");
        System.out.println("==================================");
        for (String name : nama){
            System.out.println(name);
        }

        // coba operasi poll
        System.out.println(nama.poll());

        // untuk membuktikan bahwa nama yang di-pool hilang
        System.out.println("\nList nama setelah operasi poll");
        System.out.println("==================================");
        for (String name : nama){
            System.out.println(name);
        }
    }

}
