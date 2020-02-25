public class TV extends Electronic {

    private int viewingAngle;
    private String displayFormat;

    TV(int newSum, double newDiagonal, String newVendor, String newModel, int newAngle, String newFormat)
    {
        super(newSum, newDiagonal, newVendor, newModel);
        this.viewingAngle = newAngle;
        this.displayFormat = newFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public int getViewingAngle() {
        return viewingAngle;
    }

    public void setViewingAngle(int viewingAngle) {
        this.viewingAngle = viewingAngle;
    }
}
