import java.util.Scanner;
public class PemilihanBilangan15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // Menggunakan ternary operator
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";

        System.out.println("Angka " + angka + " " + hasil);
    }
}