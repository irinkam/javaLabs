package AbstractFactory.Samsung;

import ClassHierarchy.Notebook;

public class SamsungNotebook extends Notebook {
    public SamsungNotebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newCd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newCd);
    }

    public SamsungNotebook(){}

    public static class Builder {
        String type;
        int price;
        double diagonal;
        String vendor;
        String model;
        String os;
        boolean cd;

        public Builder() {
            this.type = "Notebook";
            this.vendor = "Samsung";
        }

        public Builder price(int newPrice)
        {
            price = newPrice;
            return this;
        }
        public Builder diagonal(double newDiagonal)
        {
            diagonal = newDiagonal;
            return this;
        }
        public Builder model(String newModel)
        {
            model = newModel;
            return this;
        }
        public Builder os(String newOs)
        {
            os = newOs;
            return this;
        }
        public Builder cd(Boolean newCd)
        {
            cd = newCd;
            return this;
        }

        public SamsungNotebook build(){
            return new SamsungNotebook(this);
        }
    }

    public SamsungNotebook(Builder builder) {
        this.setType(builder.type);
        this.setVendor(builder.vendor);
        this.setPrice(builder.price);
        this.setDiagonal(builder.diagonal);
        this.setModel(builder.model);
        this.setOs(builder.os);
        this.setCdAvailability(builder.cd);
    }
}
