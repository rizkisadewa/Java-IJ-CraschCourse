public class Tester {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Anis Yuliana Phasya");
        dosen.setUmur(22);
        dosen.setNip("14000101090");
        dosen.setMatakuliah("Rekayasa Perangkat Lunak");
        System.out.println("NIP dosen : "+dosen.getNip());
        dosen.mengajarApa();
        dosen.siapaKamu();

        System.out.println();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Rizki Sadewa");
        mahasiswa.setUmur(25);
        mahasiswa.setNim("140010189");
        mahasiswa.setKelas("VA141");
        System.out.println("NIM Mahasiswa : "+mahasiswa.getNim());
        mahasiswa.kelasApa();
        mahasiswa.siapaKamu();
    }
}
