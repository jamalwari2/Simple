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


    }
}
