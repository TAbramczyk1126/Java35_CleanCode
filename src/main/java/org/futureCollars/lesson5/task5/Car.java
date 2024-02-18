package org.futureCollars.lesson5.task5;

public class Car extends Vehicle {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    protected void startEngine() {
        engine.startEngine();
    }

    protected void stopEngine() {
        engine.stopEngine();
    }

    public boolean isEngineStarted() {
        return engine.isStarted();
    }
}
