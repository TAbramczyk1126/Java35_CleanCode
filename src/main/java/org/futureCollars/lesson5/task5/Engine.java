package org.futureCollars.lesson5.task5;

public class Engine {

    private boolean isStarted;

    protected void startEngine() {
        if (!isStarted) {
            isStarted = true;
        }
    }

    protected void stopEngine() {
        if (isStarted) {
            isStarted = false;
        }
    }

    public boolean isStarted() {
        return isStarted;
    }
}
