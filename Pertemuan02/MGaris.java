package Pertemuan02;

public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(-5, 4), new Titik(3, -2));
        g1.getTitik1().printInfo("1 garis 1");
        g1.getTitik2().printInfo("2 garis 1");
        System.out.printf("Panjang garis g1: %f\n", g1.getPanjang());
        System.out.printf("Gradien garis g1: %f\n", g1.getGradien());

        Garis g2 = g1.getReflekiY();
        g2.getTitik1().printInfo("1 garis 2");
        g2.getTitik2().printInfo("2 garis 2");
        System.out.printf("Panjang garis g1: %f\n", g2.getPanjang());
        System.out.printf("Gradien garis g1: %f\n", g2.getGradien());
        System.out.printf("Apakah g1 dan g2 tegak lurus: %b\n", g1.isTegakLurus(g2));

        Garis g3 = new Garis(new Titik(-2, 3), new Titik(4, 3));
        Garis g4 = new Garis(new Titik(3, 5), new Titik(3, 6));
        System.out.printf("Apakah g3 dan g4 tegak lurus: %b\n", g3.isTegakLurus(g4));
    }
}
