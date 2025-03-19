public class persegiBiasa extends bangunDatar {
    public persegiBiasa(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }

    @Override
    public double keliling(double panjang, double lebar) {
        return 2 * getPanjang() + 2 * getLebar();
    }

    public double keliling(double panjang, double lebar, double tinggi) {
        return 2 * getPanjang() + 2 * getLebar();
    }
}
