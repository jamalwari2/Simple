public class Phone implements Headphones{
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


    @Override
    public boolean connected(boolean isConnected) {
        if (isConnected == true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }


}
