class Airplane extends Vehicle implements Flyer {
    double maxLoad;

    Airplane() {
        maxLoad = maxLoad;
    }

    public void takeOff() {
        System.out.println("Pesawat sedang lepas landas");
    }

    public void land() {
        System.out.println("Pesawat sedang mendarat");
    }

    public void fly() {
        System.out.println("Pesawat sedang terbang");
    }

    public double calcFuelEfficiency() {
        return maxLoad*100;
    }

    public double calcTripDistance() {
        return 0.0;
    }
}