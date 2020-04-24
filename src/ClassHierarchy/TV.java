package ClassHierarchy;

import ClassHierarchy.Electronic;

public class TV extends Electronic {

    private int viewingAngle;
    private String displayFormat;

    public TV(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, int newAngle, String newFormat)
    {
        super(newType, newPrice, newDiagonal, newVendor, newModel);
        this.viewingAngle = newAngle;
        this.displayFormat = newFormat;
    }

    TV(){}

    public int cost()
    {
        return super.getPrice();
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public int getViewingAngle() {
        return viewingAngle;
    }

    public void setViewingAngle(int viewingAngle) {
        this.viewingAngle = viewingAngle;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("\t\t Display format = " + this.displayFormat + "\t\t Viewing Angle = " + this.viewingAngle);
    }
}
