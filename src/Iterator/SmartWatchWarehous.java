package Iterator;

import ClassHierarchy.Phone;
import ClassHierarchy.SmartWatch;

public class SmartWatchWarehous {
    static final int MAX_COUNT = 3;
    int numberOfItems = 0;
    SmartWatch[] watches;

    public SmartWatchWarehous()
    {
        watches = new SmartWatch[MAX_COUNT];

        addSmartWatch("SmartWatch", 3200, 1.3, "Samsung", "Mi Band 4", "Android Wear", true, true, false);
        addSmartWatch("SmartWatch", 3200, 1.3, "Honor", "Band 3", "Android Wear", true, true, false);
        addSmartWatch("SmartWatch", 3200, 1.3, "Samsung", "Watch", "Android Wear", true, true, false);
    }

    public void addSmartWatch(String type, int price, double diagonal, String vendor, String model, String os, boolean sleep, boolean step, boolean pressure)
    {
        if (numberOfItems >= MAX_COUNT) {
            System.out.println("Too much watches");
        }
        else {
            SmartWatch watch = new SmartWatch(type, price, diagonal, vendor, model, os, sleep, step, pressure);
            watches[numberOfItems] = watch;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new SmartWatchIterator(watches);
    }
}
