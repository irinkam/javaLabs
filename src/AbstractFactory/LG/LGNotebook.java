package AbstractFactory.LG;

import ClassHierarchy.Notebook;
import ClassHierarchy.Phone;

public class LGNotebook extends Notebook {
    public LGNotebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newCd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newCd);
    }

    public LGNotebook(){}

}
