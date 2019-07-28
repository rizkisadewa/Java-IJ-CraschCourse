import java.util.HashMap;

public class OperasiHashMap {

    public static void main(String[] args) {
        HashMap<String, String> provinsi = new HashMap<>();

        // coba operasi put
        provinsi.put("Jawa Barat", "Bandung");
        provinsi.put("Bali", "Denpasar");
        provinsi.put("Jawa Timur", "Surabaya");

        // coba operasi get
        System.out.println(provinsi.get("Jawa Barat"));

        // coa operasi containsKey dan containsValue
        System.out.println(provinsi.containsKey("Sumatra Barat")); // will return false
        System.out.println(provinsi.containsValue("Surabaya")); // will return false
    }

}
