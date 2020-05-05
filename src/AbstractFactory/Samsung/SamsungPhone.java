package AbstractFactory.Samsung;

import ClassHierarchy.Phone;

public class SamsungPhone extends Phone {
    public SamsungPhone(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newSim, boolean newMicroSd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newSim, newMicroSd);
    }

    public SamsungPhone(){}
}
