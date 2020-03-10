public class Notebook extends SmartDevices {

    private boolean cdAvailability;

    Notebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM,
          boolean newCd){
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newRAM);
        this.cdAvailability = newCd;
    }

    public void setCdAvailability(boolean cdAvailability) {
        this.cdAvailability = cdAvailability;
    }

    public boolean isCdAvailability() {
        return cdAvailability;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("\t\t Cd Availability = " + this.cdAvailability);
    }
}