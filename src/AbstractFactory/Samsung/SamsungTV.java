package AbstractFactory.Samsung;

import ClassHierarchy.TV;

public class SamsungTV extends TV {
    public SamsungTV(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, int newAngle, String newFormat) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newAngle, newFormat);
    }

    public SamsungTV() { }
}
