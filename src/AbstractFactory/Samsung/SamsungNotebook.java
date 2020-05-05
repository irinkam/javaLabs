package AbstractFactory.Samsung;

import ClassHierarchy.Notebook;

public class SamsungNotebook extends Notebook {
    public SamsungNotebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newCd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newCd);
    }

    public SamsungNotebook(){}
}
