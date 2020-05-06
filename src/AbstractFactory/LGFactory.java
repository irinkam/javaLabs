package AbstractFactory;

import AbstractFactory.LG.*;
import ClassHierarchy.*;

public class LGFactory implements ElectronicFactory {
    @Override
    public Notebook createNotebook() {
        return new LGNotebook.Builder()
                .diagonal(15)
                .model("XXS-MD")
                .price(205000)
                .os("Windows 10")
                .cd(true)
                .build();
    }

    @Override
    public Phone createPhone() {
        return new LGPhone.Builder()
                .price(8000)
                .diagonal(5)
                .model("Zen 3")
                .os("Android 8")
                .sim(2)
                .microSd(true)
                .build();
    }

    @Override
    public SmartWatch createSmartWatch() {
        return new LGSmartWatch("SmartWatch", 1500, 1.3, "LG", "Mi Band 3", "Android Wear", true, true, false);
    }

    @Override
    public TV createTV() {
        return new LGTV("TV", 17000, 24, "LG", "Z300", 120, "16:9");
    }
}
