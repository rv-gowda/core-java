class WarRunner {

    public static void main(String[] args) {

        
        NuclearWar war1 = new NuclearWar();
        war1.country1 = "CountryA";
        war1.country2 = "CountryB";
        war1.year = 2025;

        war1.missiles = 50;
        war1.destructionLevel = 9.5;
        war1.leader = "LeaderA";
        war1.radiation = true;
        war1.location = "Border Area";

        war1.startWar();
        war1.endWar();
        war1.displayDetails();

        System.out.println("----------------");

        NuclearWar war2 = new NuclearWar();
        war2.country1 = "CountryX";
        war2.country2 = "CountryY";
        war2.year = 2030;

        war2.missiles = 30;
        war2.destructionLevel = 8.2;
        war2.leader = "LeaderB";
        war2.radiation = true;
        war2.location = "Ocean Area";

        war2.startWar();
        war2.endWar();
        war2.displayDetails();

        System.out.println("----------------");

   
        War war3 = new NuclearWar();
        war3.country1 = "Nation1";
        war3.country2 = "Nation2";
        war3.year = 2040;

        war3.startWar();
        war3.endWar();

        System.out.println("----------------");

        War war4 = new NuclearWar();
        war4.country1 = "Nation3";
        war4.country2 = "Nation4";
        war4.year = 2045;

        war4.startWar();
        war4.endWar();

        System.out.println("----------------");


        War war5 = new War();
        war5.country1 = "State1";
        war5.country2 = "State2";
        war5.year = 2000;

        war5.startWar();
        war5.endWar();

        System.out.println("----------------");

        War war6 = new War();
        war6.country1 = "State3";
        war6.country2 = "State4";
        war6.year = 1995;

        war6.startWar();
        war6.endWar();
    }
}