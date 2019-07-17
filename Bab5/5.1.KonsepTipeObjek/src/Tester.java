public class Tester {

    public static void main(String[] args) {
        PenukaranNilai pertukarannilai = new PenukaranNilai();
        pertukarannilai.setDatasatu(10);
        pertukarannilai.setDatadua(3);
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();

        pertukarannilai.setDatasatu("Anis Yuliana Phasya");
        pertukarannilai.setDatadua("Rizki Sadewa");
        pertukarannilai.tukarNilai();
        pertukarannilai.tampilHasilTukar();
    }
}
