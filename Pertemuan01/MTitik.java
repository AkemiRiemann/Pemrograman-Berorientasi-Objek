package Pertemuan01;

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(4, 5);
        Titik t3 = new Titik(-1, 4);
        System.out.println(String.format("Jumlah Titik: %d", Titik.getCounterTitik()));
        System.out.println(String.format("Titik t1 memiliki absis: %.2f dan ordinat: %.2f", t1.getAbsis(), t1.getOrdinat()));
        System.out.println(String.format("Titik t2 memiliki absis: %.2f dan ordinat: %.2f", t2.getAbsis(), t2.getOrdinat()));
        System.out.println(String.format("Titik t3 memiliki absis: %.2f dan ordinat: %.2f", t3.getAbsis(), t3.getOrdinat()));
    }
}