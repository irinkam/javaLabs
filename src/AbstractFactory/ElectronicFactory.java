package AbstractFactory;

import ClassHierarchy.*;

public interface ElectronicFactory {
    TV createTV();
    Phone createPhone();
    Notebook createNotebook();
    SmartWatch createSmartWatch();

}