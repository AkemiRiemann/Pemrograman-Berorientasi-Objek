package Modul;

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik(){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }
    
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    public void setAbsis(double a){
        this.absis = a;
    }

    public void setOrdinat(double o){
        this.ordinat = o;
    }

    public double getAbsis(){
        return this.absis;
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public void printInfo(String nama){
        System.out.printf("Titik %s memiliki berada pada koordinat (%.2f, %.2f)\n", nama, this.absis, this.ordinat);
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    public void refleksiX(){
        this.ordinat *= -1;
    }

    public void refleksiY(){
        this.absis *= -1;
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}
