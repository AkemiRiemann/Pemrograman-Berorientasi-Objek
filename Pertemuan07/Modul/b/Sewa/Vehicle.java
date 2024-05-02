package Pertemuan07.Modul.b.Sewa;

public class Vehicle {
    void callRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle Price = " + fare);
    }
}