package Iterator;

import ClassHierarchy.Notebook;

import java.util.ArrayList;

public class NotebookIterator implements Iterator {
    ArrayList notebooks;
    int position;

    public NotebookIterator(ArrayList notebooks)
    {
        this.notebooks = notebooks;
    }

    @Override
    public boolean hasNext() {
        if (position >= notebooks.size()) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Notebook next() {
        if (!hasNext()) {
            return null;
        }
        else {
            Notebook nextNote = (Notebook) notebooks.get(position);
            position += 1;
            return nextNote;
        }
    }
}
