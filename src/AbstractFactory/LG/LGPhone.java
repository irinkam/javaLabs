package AbstractFactory.LG;

import ClassHierarchy.Phone;

public class LGPhone extends Phone {
    public LGPhone(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newSim, boolean newMicroSd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newSim, newMicroSd);
    }

    public LGPhone(){}
}
