public class PC {
    private String manufacture;
    private String model;
    private String screenResolution;

    public PC(String manufacture, String model, String screenResolution) {
        this.manufacture = manufacture;
        this.model = model;
        this.screenResolution = screenResolution;
    }

    public PC() {
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

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
}
