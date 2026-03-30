class AircraftCarrier extends Carrier {

    int aircraftCount;
    String commander;
    double length;
    boolean nuclearPowered;
    int crewMembers;

    void displayDetails() {
        System.out.println("Aircraft Count: " + aircraftCount);
        System.out.println("Commander: " + commander);
        System.out.println("Length: " + length);
        System.out.println("Nuclear Powered: " + nuclearPowered);
        System.out.println("Crew Members: " + crewMembers);
    }
}