package Pertemuan07.Modul.b.PegawaiDanGaji;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + this.nama + ", Gaji pokok : " + this.gajiPokok);
    }
}
