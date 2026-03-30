class CarrierRunner {

    public static void main(String[] args) {

        AircraftCarrier carrier1 = new AircraftCarrier();
        carrier1.name = "INS Vikramaditya";
        carrier1.country = "India";
        carrier1.capacity = 30;

        carrier1.aircraftCount = 26;
        carrier1.commander = "Captain Raj";
        carrier1.length = 284;
        carrier1.nuclearPowered = false;
        carrier1.crewMembers = 1600;

        carrier1.transport();
        carrier1.dock();
        carrier1.displayDetails();

        System.out.println("----------------");

        AircraftCarrier carrier2 = new AircraftCarrier();
        carrier2.name = "USS Nimitz";
        carrier2.country = "USA";
        carrier2.capacity = 90;

        carrier2.aircraftCount = 85;
        carrier2.commander = "Captain John";
        carrier2.length = 333;
        carrier2.nuclearPowered = true;
        carrier2.crewMembers = 3000;

        carrier2.transport();
        carrier2.dock();
        carrier2.displayDetails();

        System.out.println("----------------");

        Carrier carrier3 = new AircraftCarrier();
        carrier3.name = "INS Vikrant";
        carrier3.country = "India";
        carrier3.capacity = 40;

        carrier3.transport();
        carrier3.dock();

        System.out.println("----------------");

        Carrier carrier4 = new AircraftCarrier();
        carrier4.name = "USS Enterprise";
        carrier4.country = "USA";
        carrier4.capacity = 80;

        carrier4.transport();
        carrier4.dock();

        System.out.println("----------------");


        Carrier carrier5 = new Carrier();
        carrier5.name = "Cargo Carrier";
        carrier5.country = "UK";
        carrier5.capacity = 200;

        carrier5.transport();
        carrier5.dock();

        System.out.println("----------------");

        Carrier carrier6 = new Carrier();
        carrier6.name = "Transport Carrier";
        carrier6.country = "Japan";
        carrier6.capacity = 150;

        carrier6.transport();
        carrier6.dock();
    }
}