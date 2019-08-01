public class Tester {

    public static void main(String[] args) {
        Angkot angkot = new Angkot("DK 4418 QO");
        Masyarakat masyarakat = new Masyarakat("140010189");

        masyarakat.naikAngkot(angkot);
    }
}
