package Pertemuan01;

class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }
}