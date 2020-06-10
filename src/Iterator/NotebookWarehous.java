package Iterator;

import ClassHierarchy.Notebook;

import java.util.ArrayList;

public class NotebookWarehous {
    ArrayList notebooks;

    public NotebookWarehous()
    {
        notebooks = new ArrayList();

        addNotebook("Notebook", 51550, 17.5, "Asus", "KLL", "Windows 10", true);
        addNotebook("Notebook", 60500, 17.5, "Samsung", "XS-150", "Windows 10", true);
    }

    public void addNotebook(String type, int price, double diagonal, String vendor, String model, String os, boolean cd)
    {
        Notebook notebook = new Notebook(type, price, diagonal, vendor, model, os, cd);
        notebooks.add(notebook);
    }

    public Iterator createIterator(){
        return new NotebookIterator(notebooks);
    }
}
