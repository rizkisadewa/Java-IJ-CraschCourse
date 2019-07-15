public class Tester {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling persegi = "+persegi.hitungKeliling());
        System.out.println("Luas persegi = "+persegi.hitungLuas());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(5);
        System.out.println("Keliling lingkaran = "+lingkaran.hitungKeliling());
        System.out.println("Luas persegi = "+lingkaran.hitungLuas());
    }
}
