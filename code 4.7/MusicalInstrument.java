class MusicalInstrument extends Instrument {

    String brand;
    String material;
    int keys;
    boolean electric;
    double weight;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Keys: " + keys);
        System.out.println("Electric: " + electric);
        System.out.println("Weight: " + weight);
    }
}