abstract class Animal implements Flyer {
    void eat() {
        System.out.println("Sedang makan...");
    }

    public String toString() {
        return "Saya adalah hewan";
    }

    public void takeOff() {}
    public void land() {}
    public void fly() {}
}