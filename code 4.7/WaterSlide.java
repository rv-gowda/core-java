class WaterSlide extends Slide {

    double waterSpeed;
    String parkName;
    boolean safetyTube;
    int capacity;
    String shape;

    void displayDetails() {
        System.out.println("Water Speed: " + waterSpeed);
        System.out.println("Park Name: " + parkName);
        System.out.println("Safety Tube: " + safetyTube);
        System.out.println("Capacity: " + capacity);
        System.out.println("Shape: " + shape);
    }
}