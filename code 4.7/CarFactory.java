class CarFactory extends Factory {

    String carBrand;
    int carsProducedPerDay;
    boolean electricCars;
    double factoryArea;
    int machines;

    void displayFactoryDetails() {
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Cars Per Day: " + carsProducedPerDay);
        System.out.println("Electric Cars: " + electricCars);
        System.out.println("Factory Area: " + factoryArea);
        System.out.println("Machines: " + machines);
    }
}