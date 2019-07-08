public class Tester {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Sadewa");
        dosen.setUmur(25);
        dosen.setNip("140010189");
        dosen.setMatakuliah("Rekaya Perangkat Lunak");
        System.out.print("NIP Dosen : "+dosen.getNip());
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Anis Yuliana Phasya");
        mahasiswa.setUmur(22);
        mahasiswa.setNim("140010189");
        mahasiswa.setKelas("IF-10");
        System.out.print("NIM Mahasiswa : "+mahasiswa.getNim());
        mahasiswa.kelasApa();
    }
}
