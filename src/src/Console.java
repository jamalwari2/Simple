public class Console implements Games{
    private String manufacture;
    private String model;
    private String screenResolution;

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

    public Console(String manufacture, String model, String screenResolution) {
        this.manufacture = manufacture;
        this.model = model;
        this.screenResolution = screenResolution;
    }

    @Override
    public void playing() {
        System.out.println("Game Loaded");
    }
}
