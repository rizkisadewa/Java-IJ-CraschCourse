public class PanggilSebuahKelas {

    public static void main(String[] args) {
        try{
            // Coba mencari kelas String yang terdapat di Java
            Class kelas = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e){
            System.out.println("Kelas yang dicari tidak ditemukan");
        }

        try{
            // Coba mencari kelas yang tidak ada
            Class kelas = Class.forName("java.lang.FakeString");
        } catch (ClassNotFoundException e){
            System.out.println("Kelas yang dicari tidak ditemukan");
        }
    }
}
