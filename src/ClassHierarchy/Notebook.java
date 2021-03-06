package ClassHierarchy;

public class Notebook extends SmartDevices {

    private boolean cdAvailability;

    public Notebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs,
                    boolean newCd){
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs);
        this.cdAvailability = newCd;
    }

    public Notebook(){}

    public boolean isCdAvailability() {
        return cdAvailability;
    }

    public void setCdAvailability(boolean cdAvailability) {
        this.cdAvailability = cdAvailability;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("\t\t Cd Availability = " + this.cdAvailability);
    }
}
