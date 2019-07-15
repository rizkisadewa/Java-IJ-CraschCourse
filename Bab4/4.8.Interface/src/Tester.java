public class Tester {
    public static void main(String[] args) {

        Persegi persegi = new Persegi();
        persegi.setSisi(4);
        System.out.println("Luas persegi : "+persegi.hitungLuas());
        System.out.println("Keliling persegi : "+persegi.hitungKeliling());

        System.out.println();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(5);
        System.out.println("Luas lingkaran : "+lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran"+lingkaran.hitungKeliling());
    }
}

