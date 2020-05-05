package AbstractFactory.Samsung;

import ClassHierarchy.SmartWatch;

public class SamsungSmartWatch extends SmartWatch {
    public SamsungSmartWatch(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newSleep, boolean newStep, boolean newPressure) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newSleep, newStep, newPressure);
    }

    public SamsungSmartWatch(){}
}
