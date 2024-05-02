package Pertemuan07.Modul.a;

public class Coercion {
    public static void prob1(){
        int output = 'a'; // Menjadi kode ASCII dari karakter 'a', yaitu 97
        System.out.println(output);
    }

    public static void prob2(){
        // double x = 15.5;
        // int output = x; Tidak bisa melakukan koersi dari double menjadi integer
        // System.out.println(output);
    }

    public static void prob3(){
        int y = 25;
        double output = y; // Mengubah integer menjadi double, dengan koma menjadi 25.0
        System.out.println(output);
    }

    public static void prob4(){
        int z = 78;
        char output = (char) z; // Melakukan casting dari integer menjadi char, dengan kode ASCII menjadi karakter 'N'
        System.out.println(output);
    }

    public static void prob5(){
        char a = 'a';
        double output = a; // Melakukan koersi dari karakter 'a', menjadi double yaitu 97.0
        System.out.println(output);
    }

    public static void main(String[] args) {
        prob1();
        prob2();
        prob3();
        prob4();
        prob5();
    }
}
