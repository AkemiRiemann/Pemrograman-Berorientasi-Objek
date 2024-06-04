class RiverBarge extends Vehicle {
    double maxLoad;

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*150;
    }

    public double calcTripDistance() {
        return 0.0;
    }
}