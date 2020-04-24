package ClassHierarchy;

public class Phone extends SmartDevices {

    private int numberOfSim;
    private boolean microSdAvailability;

    public Phone(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs,
                 int newSim, boolean newMicroSd){
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs);
        this.numberOfSim = newSim;
        this.microSdAvailability = newMicroSd;
    }

    Phone(){}

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

    @Override
    public void display() {
        super.display();
        System.out.println("\t\t Number of Sim = " + this.numberOfSim + "\t\t MicroSD Availability = " + this.microSdAvailability);
    }
}
