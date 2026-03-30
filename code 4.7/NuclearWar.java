class NuclearWar extends War {

    int missiles;
    double destructionLevel;
    String leader;
    boolean radiation;
    String location;

    void displayDetails() {
        System.out.println("Missiles: " + missiles);
        System.out.println("Destruction Level: " + destructionLevel);
        System.out.println("Leader: " + leader);
        System.out.println("Radiation: " + radiation);
        System.out.println("Location: " + location);
    }
}