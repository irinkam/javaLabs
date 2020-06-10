package Iterator;

import ClassHierarchy.Phone;

import java.util.LinkedList;

public class PhoneWarehous {
    LinkedList phones;

    public PhoneWarehous()
    {
        phones = new LinkedList();

        addPhone("Phone", 25600, 5.5, "Samsung", "MS 30", "Android 9", 2, true);
        addPhone("Phone", 18300, 5, "Asus", "Zenfon 4", "Android 9", 2, true);
    }

    public void addPhone(String name, int price, double diagonal, String vendor, String model, String os, int sim, boolean microSd)
    {
        Phone phone = new Phone(name, price, diagonal, vendor, model, os, sim, microSd);
        phones.add(phone);
    }

    public Iterator createIterator(){
        return new PhoneIterator(phones);
    }
}