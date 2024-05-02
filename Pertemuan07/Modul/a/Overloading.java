package Pertemuan07.Modul.a;

public class Overloading {
    public static void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args){
        printMessage();
        printMessage("Halo, Dunia!");
        printMessage("Pemrograman Berorientasi Objek", 3);
    }
}
