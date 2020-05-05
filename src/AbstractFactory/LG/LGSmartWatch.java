package AbstractFactory.LG;

import ClassHierarchy.SmartWatch;

public class LGSmartWatch extends SmartWatch {
    public LGSmartWatch(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newSleep, boolean newStep, boolean newPressure) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newSleep, newStep, newPressure);
    }

    public LGSmartWatch(){}
}
