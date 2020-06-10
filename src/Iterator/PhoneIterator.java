package Iterator;

import ClassHierarchy.Phone;
import java.util.LinkedList;

public class PhoneIterator implements Iterator {
    LinkedList phones;
    int position;

    public PhoneIterator(LinkedList phones)
    {
        this.phones = phones;
    }

    @Override
    public boolean hasNext() {
        if (position >= phones.size()) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Phone next() {
        if (!hasNext()) {
            return null;
        }
        else {
            Phone nextPhone = (Phone) phones.get(position);
            position += 1;
            return nextPhone;
        }
    }
}
