public class BidirectionalOneOne {

    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMAT Krida Nusantara");
        KepalaSekolah kepalaSekolah = new KepalaSekolah("Pak Yudis");

        // association bidirectional terjadi di sini
        sekolah.setKepalaSekolah(kepalaSekolah);
        kepalaSekolah.setSekolah(sekolah);

        // memunculkan nilai dari objek sekolah
        System.out.println(sekolah.getNamaSekolah());
        System.out.println(sekolah.getKepalaSekolah().getNamaKepalaSekolah());

        // memunculkain nilai dari objek kepala sekolah
        System.out.println(kepalaSekolah.getNamaKepalaSekolah());
        System.out.println(kepalaSekolah.getSekolah().getNamaSekolah());
    }
}
