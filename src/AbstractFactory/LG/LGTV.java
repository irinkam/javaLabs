package AbstractFactory.LG;

import ClassHierarchy.TV;

public class LGTV extends TV {
    public LGTV(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, int newAngle, String newFormat) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newAngle, newFormat);
    }

    public LGTV(){}
}
