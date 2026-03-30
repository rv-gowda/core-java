class AirBalloonAirBalloon extends Balloon {

    int capacity;
    String pilotName;
    double maxHeight;
    boolean touristRide;
    String location;

    void displayDetails() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Pilot: " + pilotName);
        System.out.println("Max Height: " + maxHeight);
        System.out.println("Tourist Ride: " + touristRide);
        System.out.println("Location: " + location);
    }
}