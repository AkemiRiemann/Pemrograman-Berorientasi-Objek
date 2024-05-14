package Pertemuan08.Penugasan;

public class Main {
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;

        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
