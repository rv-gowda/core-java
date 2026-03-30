class DigitalClock extends Clock {

    boolean battery;
    String displayType;
    int brightnessLevel;
    String color;
    boolean bluetooth;

    void displayDetails() {
        System.out.println("Battery: " + battery);
        System.out.println("Display Type: " + displayType);
        System.out.println("Brightness Level: " + brightnessLevel);
        System.out.println("Color: " + color);
        System.out.println("Bluetooth: " + bluetooth);
    }
}