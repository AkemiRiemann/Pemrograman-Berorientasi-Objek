package org.bangundatar;
import org.poligon.*;

public class Segitiga extends Poligon {
    private double a, b, c;

    public Segitiga(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.jumlahSisi = 3;
    }

    public double hitungLuas(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double hitungKeliling(){
        return a + b + c;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi " + this.getJumlahSisi());
    }
}
