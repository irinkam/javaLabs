public class SmartDevices extends Electronic{
    private String os;
    private int RAM;

    SmartDevices(int newSum, double newDiagonal, String newVendor, String newModel, String newOs, int newRAM) {
        super(newSum, newDiagonal, newVendor, newModel);
        this.os = newOs;
        this.RAM = newRAM;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
}
