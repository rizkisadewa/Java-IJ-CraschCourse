public class Mahasiswa {

    private String nim;
    private String nama;
    private Kelas kelas;

    public Mahasiswa(String nim, String nama, Kelas kelas){
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }
}
