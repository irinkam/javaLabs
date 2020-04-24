package ClassHierarchy;

import ClassHierarchy.Electronic;

public class SmartDevices extends Electronic {
    private String os;

    public int cost()
    {
        return super.getPrice();
    }

    SmartDevices(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs) {
        super(newType, newPrice, newDiagonal, newVendor, newModel);
        this.os = newOs;
    }

    SmartDevices(){}

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    @Override
    public void display() {
        super.display();
        System.out.print("\t\t OS = " + this.os);
    }
}
