package ClassHierarchy;

import java.text.DecimalFormat;

public abstract class Electronic {

    private String type;
    private int price;
    private double diagonal;
    private String vendor;
    private String model;

    public Electronic() { }

    Electronic(String newType, int newPrice, double newDiagonal, String newVendor, String newModel) {
        this.type = newType;
        this.price = newPrice;
        this.diagonal = newDiagonal;
        this.vendor = newVendor;
        this.model = newModel;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public abstract int cost(); // для декораторов

    public void display() {
        // ДЛЯ КРАСИВОГО ФОРМАТИРОВАНИЯ
        DecimalFormat df = new DecimalFormat("0.0");
        String tab = "\t\t";
        if (type.equals("ClassHierarchy.TV"))
            tab = "\t\t\t";
        else if (type.equals("ClassHierarchy.SmartWatch"))
            tab = "\t";
        String priceTab = "\t\t";
        if (this.price < 10000)
            priceTab = "\t\t\t";
        String diagTab = "\t\t";
        if (this.diagonal < 10)
            priceTab = "\t\t\t";
        String modTab = "\t\t";
        if (this.vendor.length() == 7)
            modTab = "\t";
        if (this.vendor.length() == 2)
            modTab = "\t\t\t";
        // КРАСИВОЕ ФОРМАТИРОВАНИЕ КОНЧИЛОСЬ
        System.out.print("Type = " + this.type + tab + "Price = " + this.price + "rub" + priceTab + "Diagonal = " + df.format(this.diagonal)
                + diagTab + "Vendor = " + this.vendor + modTab + "Model = " + this.model);

    }

    // для фабрики
    public void assemble() {
    } // сборка электроники

    public void box() {
    } // упаковка электроники
}