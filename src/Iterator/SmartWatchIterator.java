package Iterator;

import ClassHierarchy.SmartWatch;

public class SmartWatchIterator implements Iterator {
    SmartWatch[] watches;
    int position = 0;

    public SmartWatchIterator(SmartWatch[] watches)
    {
        this.watches = watches;
    }

    @Override
    public boolean hasNext() {
        if (position >= watches.length) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public SmartWatch next() {
        if (!hasNext()){
            return null;
        }
        else {
            SmartWatch nextFlat = watches[position];
            position += 1;
            return nextFlat;
        }
    }
}
