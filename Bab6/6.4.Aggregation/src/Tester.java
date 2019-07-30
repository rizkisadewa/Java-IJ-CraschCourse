import java.util.LinkedList;

public class Tester {

    public static void main(String[] args) {
        LinkedList<Dosen> listDosen = new LinkedList<>();
        ProgramStudi programStudi = new ProgramStudi("Teknik Informatika");

        listDosen.add(new Dosen("Rizki Sadewa"));
        listDosen.add(new Dosen("Anis Yuliana Phasya"));
        listDosen.add(new Dosen("Dicky Putra Sadewa"));
        listDosen.add(new Dosen("Zahra Putri Yuliana"));

        programStudi.setListDosen(listDosen);

        System.out.println("List Dosen "+programStudi.getNamaProgramStudi());
        System.out.println("==================================");
        for(Dosen lecturer : listDosen){
            System.out.println(lecturer.getNamaDosen());
        }
    }

}
