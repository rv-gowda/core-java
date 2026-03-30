class FactoryRunner {

    public static void main(String[] args) {

        CarFactory factory1 = new CarFactory();
        factory1.name = "Tata Motors";
        factory1.location = "Pune";
        factory1.workers = 500;

        factory1.carBrand = "Tata";
        factory1.carsProducedPerDay = 300;
        factory1.electricCars = true;
        factory1.factoryArea = 12000;
        factory1.machines = 200;

        factory1.startProduction();
        factory1.stopProduction();
        factory1.displayFactoryDetails();

        System.out.println("----------------");

        CarFactory factory2 = new CarFactory();
        factory2.name = "Toyota Plant";
        factory2.location = "Bangalore";
        factory2.workers = 600;

        factory2.carBrand = "Toyota";
        factory2.carsProducedPerDay = 350;
        factory2.electricCars = false;
        factory2.factoryArea = 15000;
        factory2.machines = 250;

        factory2.startProduction();
        factory2.stopProduction();
        factory2.displayFactoryDetails();

        System.out.println("----------------");

        Factory factory3 = new CarFactory();
        factory3.name = "Hyundai Factory";
        factory3.location = "Chennai";
        factory3.workers = 700;

        factory3.startProduction();
        factory3.stopProduction();

        System.out.println("----------------");

        Factory factory4 = new CarFactory();
        factory4.name = "Honda Plant";
        factory4.location = "Delhi";
        factory4.workers = 650;

        factory4.startProduction();
        factory4.stopProduction();

        System.out.println("----------------");

        Factory factory5 = new Factory();
        factory5.name = "Textile Factory";
        factory5.location = "Surat";
        factory5.workers = 400;

        factory5.startProduction();
        factory5.stopProduction();

        System.out.println("----------------");

        Factory factory6 = new Factory();
        factory6.name = "Steel Factory";
        factory6.location = "Jamshedpur";
        factory6.workers = 550;

        factory6.startProduction();
        factory6.stopProduction();
    }
}