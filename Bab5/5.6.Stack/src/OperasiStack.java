import java.util.Stack;

public class OperasiStack {

    public static void main(String[] args) {
        Stack<String> nama = new Stack<>();

        // coba operasi push
        nama.push("Santika");
        nama.push("Anis Yuliana Phasya");
        nama.push("Rizki Sadewa");
        nama.push("Abimanyu");

        // coba operasi pop
        System.out.println(nama.pop()); // mengambil Abimanyu
        System.out.println(nama.pop()); // mengambil Rizki Sadewa
    }

}
