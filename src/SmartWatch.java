public class SmartWatch extends SmartDevices {

    private boolean sleepTimer;
    private boolean stepCounter;
    private boolean pressureCounter;

    SmartWatch(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM,
                boolean newSleep, boolean newStep, boolean newPressure){
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newRAM);
        this.sleepTimer = newSleep;
        this.stepCounter = newStep;
        this.pressureCounter = newPressure;
    }

    public void setSleepTimer(boolean sleepTimer) {
        this.sleepTimer = sleepTimer;
    }

    public boolean isSleepTimer() {
        return sleepTimer;
    }

    public void setStepCounter(boolean stepCounter) {
        this.stepCounter = stepCounter;
    }

    public boolean isStepCounter() {
        return stepCounter;
    }

    public void setPressureCounter(boolean pressureCounter) {
        this.pressureCounter = pressureCounter;
    }

    public boolean isPressureCounter() {
        return pressureCounter;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\t\t Pressure = " + this.pressureCounter + "\t\t Step Counter = " + this.stepCounter +
                "\t\t Sleep Timer = " + this.sleepTimer );
    }
}
