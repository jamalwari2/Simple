public class Simple1 {
    public static void main(String [] args){
        System.out.println("Doing something ");
        DoSomething doSomething = new DoSomething();
        doSomething.DoSomething();

        Phone phone =  new Phone();
        phone.setManufacture("Apple");
        phone.setModel("13 Pro Max");
        phone.setScreenSize("7 inch");

        System.out.println("Phone requested is : ");

        System.out.println("Manufacture: "+phone.getManufacture());
        System.out.println("Model: "+phone.getModel());
        System.out.println("Screen Size: "+phone.getScreenSize());
        System.out.println();


        Console console1 = new Console("Sony", "Playstation 5", "4K 120Hz");

        System.out.println("Console Information: ");
        System.out.println("Manufacture: "+ console1.getManufacture());
        System.out.println("Model: "+ console1.getModel());
        System.out.println("Screen Resolution: "+ console1.getScreenResolution());

        System.out.println();

        PC pc = new PC("HP","hje22323", "4K 60FPS");

        System.out.println("PC: ");
        System.out.println("Manufacture: "+ pc.getManufacture());
        System.out.println("Model: "+ pc.getModel());
        System.out.println("Screen Resolution: "+ pc.getScreenResolution());

    }
}
