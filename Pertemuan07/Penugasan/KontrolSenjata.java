package Pertemuan07.Penugasan;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            int tembakan = Math.min(jumlah, senjata.getPeluru());
            for (int i = 0; i < tembakan; i++){
                System.out.println(senjata.getBunyi());
            }
            for (int i = 0; i < jumlah-tembakan; i++){
                System.out.println("Gagal tembak, Peluru Habis");
            }
            senjata.setPeluru(Math.max(senjata.getPeluru()-jumlah, 0));
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru Habis");
        }
    }

    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk(){
        if (senjata.isMenusuk()){
            return "Jleb!";
        }
        else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
