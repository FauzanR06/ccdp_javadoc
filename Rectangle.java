/**
 * Kelas Rectangle digunakan untuk merepresentasikan persegi panjang.
 */
public class Rectangle {
    private double length; // panjang persegi panjang
    private double width;  // lebar persegi panjang

    /**
     * Konstruktor untuk kelas Rectangle.
     * @param length panjang persegi panjang
     * @param width lebar persegi panjang
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Metode untuk menghitung luas persegi panjang.
     * @return luas persegi panjang
     */
    public double area() {
        return length * width;
    }

    /**
     * Metode untuk menghitung keliling persegi panjang.
     * @return keliling persegi panjang
     */
    public double perimeter() {
        return 2 * (length + width);
    }

    /**
     * Metode utama untuk menguji kelas Rectangle.
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0); // contoh panjang 5 dan lebar 3
        System.out.println("Luas Persegi Panjang: " + rectangle.area());
        System.out.println("Keliling Persegi Panjang: " + rectangle.perimeter());
    }
}
