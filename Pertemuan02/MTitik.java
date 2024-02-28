package Pertemuan02;

public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(3, 4);
        t1.printInfo("t1");
        System.out.printf("Jarak titik t1 terhadap titik origin %.2f\n", t1.getJarakPusat());
        t1.refleksiX();
        t1.printInfo("t1");
        t1.refleksiY();
        t1.printInfo("t1");

        Titik t2 = t1.getRefleksiX();
        t1.printInfo("t1");
        t2.printInfo("t2");

        Titik t3 = t2.getRefleksiY();
        t1.printInfo("t1");
        t2.printInfo("t2");
        t3.printInfo("t3");
    }
}
