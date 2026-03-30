class EarthOrbit extends Orbit {

    int satellites;
    double orbitalPeriod;
    String discoveredBy;
    boolean habitableZone;
    String galaxy;

    void displayOrbitDetails() {
        System.out.println("Satellites: " + satellites);
        System.out.println("Orbital Period: " + orbitalPeriod);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Habitable Zone: " + habitableZone);
        System.out.println("Galaxy: " + galaxy);
    }
}