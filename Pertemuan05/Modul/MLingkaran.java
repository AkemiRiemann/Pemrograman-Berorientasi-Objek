import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari: ");
        double jari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah " + l.hitungLuas());
    }
}
