package Pertemuan07.Modul.b.Sewa;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.callRent(50, 1000);
        mobil.callRent(50, 1000);
        bis.callRent(50, 1000);
    }
}