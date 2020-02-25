public class Phone extends SmartDevices{

    private int numberOfSim;
    private boolean microSdAvailability;

    Phone(int newSum, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM,
          int newSim, boolean newMicroSd){
        super(newSum, newDiagonal, newVendor, newModel, newOs, newRAM);
        this.numberOfSim = newSim;
        this.microSdAvailability = newMicroSd;
    }

    public int getNumberOfSim() {
        return numberOfSim;
    }

    public void setNumberOfSim(int numberOfSim) {
        this.numberOfSim = numberOfSim;
    }

    public void setMicroSdAvailability(boolean microSdAvailability) {
        this.microSdAvailability = microSdAvailability;
    }

    public boolean isMicroSdAvailability() {
        return microSdAvailability;
    }
}
