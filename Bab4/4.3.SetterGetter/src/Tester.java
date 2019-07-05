public class Tester {

    public static void main(String[] args) {
        Persegi persegi = new Persegi(10);
        System.out.println("Sisi Persegi = "+persegi.getSisi());
        System.out.println("Keliling Persegi = "+persegi.hitungKeliling());
        System.out.println("Luas Persegi = "+persegi.hitungLUas());

        PersegiPanjang persegipanjang = new PersegiPanjang(10,20);
        System.out.println("Lebar Persegi Panjang = "+persegipanjang.getLebar());
        System.out.println("Panjang Persegi Panjang = "+persegipanjang.getPanjang());
        System.out.println("Keliling Persegi Panjang = "+persegipanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang = "+persegipanjang.hitungLuas());
    }
}
