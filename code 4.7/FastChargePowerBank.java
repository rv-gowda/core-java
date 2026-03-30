class FastChargePowerBank extends PowerBank {

    boolean fastCharge;
    int ports;
    String color;
    double weight;
    boolean ledDisplay;

    void displayDetails() {
        System.out.println("Fast Charge: " + fastCharge);
        System.out.println("Ports: " + ports);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("LED Display: " + ledDisplay);
    }
}