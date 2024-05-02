package Pertemuan07.Modul.b.Sewa;

public class Car extends Vehicle {
    void callRent(int jarak, float harga){
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
