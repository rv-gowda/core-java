class BottleOpener extends Opener {

    String type;
    boolean stainlessSteel;
    double weight;
    String color;
    boolean portable;

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Stainless Steel: " + stainlessSteel);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Portable: " + portable);
    }
}