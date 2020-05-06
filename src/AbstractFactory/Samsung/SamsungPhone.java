package AbstractFactory.Samsung;

import ClassHierarchy.Phone;

public class SamsungPhone extends Phone {
    public SamsungPhone(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, int newSim, boolean newMicroSd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newSim, newMicroSd);
    }

    public SamsungPhone(){}

    public static class Builder {
        String type;
        int price;
        double diagonal;
        String vendor;
        String model;
        String os;
        int sim;
        boolean microSd;

        public Builder() {
            this.type = "Phone";
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
        public Builder sim(int newSim)
        {
            sim = newSim;
            return this;
        }

        public Builder microSd(Boolean newMicroSd)
        {
            microSd = newMicroSd;
            return this;
        }

        public SamsungPhone build(){
            return new SamsungPhone(this);
        }
    }

    public SamsungPhone(Builder builder) {
        this.setType(builder.type);
        this.setVendor(builder.vendor);
        this.setPrice(builder.price);
        this.setDiagonal(builder.diagonal);
        this.setModel(builder.model);
        this.setOs(builder.os);
        this.setNumberOfSim(builder.sim);
        this.setMicroSdAvailability(builder.microSd);
    }
}
