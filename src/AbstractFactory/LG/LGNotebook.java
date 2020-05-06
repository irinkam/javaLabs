package AbstractFactory.LG;

import ClassHierarchy.Notebook;
import ClassHierarchy.Phone;

public class LGNotebook extends Notebook {
    public LGNotebook(String newType, int newPrice, double newDiagonal, String newVendor, String newModel, String newOs, boolean newCd) {
        super(newType, newPrice, newDiagonal, newVendor, newModel, newOs, newCd);
    }

    public LGNotebook(){}

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
            this.vendor = "LG";
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

        public LGNotebook build(){
            return new LGNotebook(this);
        }
    }

    public LGNotebook(Builder builder) {
        this.setType(builder.type);
        this.setVendor(builder.vendor);
        this.setPrice(builder.price);
        this.setDiagonal(builder.diagonal);
        this.setModel(builder.model);
        this.setOs(builder.os);
        this.setCdAvailability(builder.cd);
    }
}

