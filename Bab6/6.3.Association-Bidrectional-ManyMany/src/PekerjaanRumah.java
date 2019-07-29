import java.util.Stack;

public class PekerjaanRumah {
    Stack<AnggotaKeluarga> keluarga = new Stack<>();
    Stack<Pekerjaan> pekerjaan = new Stack<>();

    public void addKeluarga(String namaAnggota){
        keluarga.add(new AnggotaKeluarga(namaAnggota));
    }

    public void addPekerjaan(String namaPekerjaan){
        pekerjaan.add(new Pekerjaan(namaPekerjaan));
    }

    public void mappingKerja(){
        System.out.print(keluarga.pop().getNamaAnggota());
        System.out.print(" ");
        System.out.println(pekerjaan.pop().getNamaPekerjaan());
    }

    public static void main(String[] args) {
        PekerjaanRumah pr = new PekerjaanRumah();
        pr.addKeluarga("ibu");
        pr.addKeluarga("ayah");
        pr.addKeluarga("adik");
        pr.addKeluarga("kakak");
        pr.addPekerjaan("Memasak");
        pr.addPekerjaan("Berkebun");
        pr.addPekerjaan("Menyapu");
        pr.addPekerjaan("Mengepel");

        pr.mappingKerja();
        pr.mappingKerja();
        pr.mappingKerja();
        pr.mappingKerja();

    }
}
