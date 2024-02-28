package Pertemuan02;

public class Garis {
    private Titik t1;
    private Titik t2;

    public Garis(Titik t1, Titik t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public Titik getTitik1(){
        return this.t1;
    }

    public Titik getTitik2(){
        return this.t2;
    }

    public void setTitik1(Titik t1){
        this.t1 = t1;
    }

    public void setTitik2(Titik t2){
        this.t2 = t2;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(t1.getAbsis()-t2.getAbsis(), 2) + Math.pow(t1.getOrdinat()-t2.getOrdinat(), 2));
    }

    public double getGradien(){
        return (t2.getOrdinat()-t1.getOrdinat()) / (t2.getAbsis()-t1.getAbsis());
    }

    public Garis getReflekiY(){
        return new Garis(t1.getRefleksiY(), t2.getRefleksiY());
    }

    public boolean isTegakLurus(Garis G){
        if (this.t1.getAbsis() == this.t2.getAbsis()){
            return G.getTitik1().getOrdinat() == G.getTitik2().getOrdinat();
        }
        else if (G.getTitik1().getAbsis() == G.getTitik2().getAbsis()){
            return this.t1.getOrdinat() == this.t2.getOrdinat();
        }
        return this.getGradien() * G.getGradien() == -1;
    }
}
