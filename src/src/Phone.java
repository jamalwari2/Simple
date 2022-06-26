public class Phone {
    private String manufacture;
    private String model;
    private String screenSize;

    public Phone() {
    }

    public Phone(String manufacture, String model, String screenSize) {
        this.manufacture = manufacture;
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
