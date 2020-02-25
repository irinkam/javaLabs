public class Electronic {

    private int sum;
    private double diagonal;
    private String vendor;
    private String model;

    Electronic (int newSum, double newDiagonal, String newVendor, String newModel)
    {
        this.sum = newSum;
        this.diagonal = newDiagonal;
        this.vendor = newVendor;
        this.model = newModel;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void display() {}
}
