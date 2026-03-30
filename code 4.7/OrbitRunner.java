class OrbitRunner {

    public static void main(String[] args) {

        EarthOrbit orbit1 = new EarthOrbit();
        orbit1.planet = "Earth";
        orbit1.distanceFromSun = 149.6;
        orbit1.shape = "Elliptical";

        orbit1.satellites = 1;
        orbit1.orbitalPeriod = 365.25;
        orbit1.discoveredBy = "Ancient Astronomers";
        orbit1.habitableZone = true;
        orbit1.galaxy = "Milky Way";

        orbit1.revolve();
        orbit1.speed();
        orbit1.displayOrbitDetails();

        System.out.println("----------------");

        EarthOrbit orbit2 = new EarthOrbit();
        orbit2.planet = "Mars";
        orbit2.distanceFromSun = 227.9;
        orbit2.shape = "Elliptical";

        orbit2.satellites = 2;
        orbit2.orbitalPeriod = 687;
        orbit2.discoveredBy = "Ancient Astronomers";
        orbit2.habitableZone = false;
        orbit2.galaxy = "Milky Way";

        orbit2.revolve();
        orbit2.speed();
        orbit2.displayOrbitDetails();

        System.out.println("----------------");

        Orbit orbit3 = new EarthOrbit();
        orbit3.planet = "Venus";
        orbit3.distanceFromSun = 108.2;
        orbit3.shape = "Elliptical";

        orbit3.revolve();
        orbit3.speed();

        System.out.println("----------------");

        Orbit orbit4 = new EarthOrbit();
        orbit4.planet = "Mercury";
        orbit4.distanceFromSun = 57.9;
        orbit4.shape = "Elliptical";

        orbit4.revolve();
        orbit4.speed();

        System.out.println("----------------");

        Orbit orbit5 = new Orbit();
        orbit5.planet = "Jupiter";
        orbit5.distanceFromSun = 778.5;
        orbit5.shape = "Elliptical";

        orbit5.revolve();
        orbit5.speed();

        System.out.println("----------------");

        Orbit orbit6 = new Orbit();
        orbit6.planet = "Saturn";
        orbit6.distanceFromSun = 1434;
        orbit6.shape = "Elliptical";

        orbit6.revolve();
        orbit6.speed();
    }
}