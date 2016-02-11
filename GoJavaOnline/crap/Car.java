package test;

public class Car {
    private Engine engine;

    public Car(final Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean start() {
        return this.engine.start();
    }
}
