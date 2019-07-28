import java.util.LinkedList;

public class BidirectionalOneMany {

    public static void main(String[] args) {
        // membuat beberapa data mahasiswa
        LinkedList<Mahasiswa> mhs = new LinkedList<>();
        Kelas kelas = new Kelas("VA141", mhs);

        // association one to many
        mhs.addFirst(new Mahasiswa("10104007", "Rizki Sadewa", kelas));
        mhs.addFirst(new Mahasiswa("140010189", "Anis Yuliana Phasya", kelas));
        mhs.addFirst(new Mahasiswa("14990909", "Anis Yuliana Phasya", kelas));

        System.out.println("List mahasiswa "+kelas.getNamaKelas());
        System.out.println("=====================");
        for(Mahasiswa listMhs : kelas.getMahasiswa()){
            System.out.println(listMhs.getNim()+" - "+listMhs.getNama());
        }
    }
}
