package test;

public class Engine {
    private int power;

    public Engine(final int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public boolean start() {
        return true;
    }

    public boolean stop() {
        return true;
    }
}
