public class CobaOverloading {

    public static void ulangiHalo(){
        for (int i=1;i<=3;i++){
            System.out.println("Hallo");
        }
    }

    public static  void ulangiHalo(int beberapakali){
        for (int i=1;i<=beberapakali;i++){
            System.out.println("Hallo");
        }
    }

    public static void main(String[] args) {
        // memanggil ulangHalo()
        ulangiHalo();

        System.out.println();

        // Memanggil ulangHalo(int beberapakali)
        ulangiHalo(4);
    }
}
