public class Tester {

    public static void main(String[] args) {
        PertukaranNilai<Integer> tukarinteger = new PertukaranNilai<>();
        tukarinteger.setDatasatu(10);
        tukarinteger.setDatadua(20);
        tukarinteger.tukarNilai();
        tukarinteger.tampilHasilTukar();

        System.out.println();

        PertukaranNilai<String> tukarstring = new PertukaranNilai<>();
        tukarstring.setDatasatu("Rizki Sadewa");
        tukarstring.setDatadua("Anis Yuliana Phasya");
        tukarstring.tukarNilai();
        tukarstring.tampilHasilTukar();
    }
}
