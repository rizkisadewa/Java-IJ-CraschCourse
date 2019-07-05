public class Persegi {
    private double sisi;

    // tambahan bagian konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling(){
        return 4 * sisi; // rumus keliling persegi
    }

    public double hitungLUas(){
        return sisi * sisi; // rumus luas persegi
    }
}
