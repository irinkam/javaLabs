public class Notebook extends SmartDevices {

    private boolean cdAvailability;

    Notebook(int newSum, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM,
          boolean newCd){
        super(newSum, newDiagonal, newVendor, newModel, newOs, newRAM);
        this.cdAvailability = newCd;
    }

    public void setCdAvailability(boolean cdAvailability) {
        this.cdAvailability = cdAvailability;
    }

    public boolean isCdAvailability() {
        return cdAvailability;
    }
}
