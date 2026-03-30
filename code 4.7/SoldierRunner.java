class SoldierRunner {

    public static void main(String[] args) {

        SpecialSoldier soldier1 = new SpecialSoldier();
        soldier1.name = "Arjun";
        soldier1.rank = "Captain";
        soldier1.age = 35;

        soldier1.weapon = "Sniper";
        soldier1.missionType = "Rescue";
        soldier1.experienceYears = 10;
        soldier1.nightVision = true;
        soldier1.unitName = "Para SF";

        soldier1.attack();
        soldier1.defend();
        soldier1.displayDetails();

        System.out.println("----------------");

        SpecialSoldier soldier2 = new SpecialSoldier();
        soldier2.name = "Vikram";
        soldier2.rank = "Major";
        soldier2.age = 40;

        soldier2.weapon = "Assault Rifle";
        soldier2.missionType = "Combat";
        soldier2.experienceYears = 15;
        soldier2.nightVision = true;
        soldier2.unitName = "Black Commandos";

        soldier2.attack();
        soldier2.defend();
        soldier2.displayDetails();

        System.out.println("----------------");

        Soldier soldier3 = new SpecialSoldier();
        soldier3.name = "Ravi";
        soldier3.rank = "Lieutenant";
        soldier3.age = 30;

        soldier3.attack();
        soldier3.defend();

        System.out.println("----------------");

        Soldier soldier4 = new SpecialSoldier();
        soldier4.name = "Karan";
        soldier4.rank = "Captain";
        soldier4.age = 33;

        soldier4.attack();
        soldier4.defend();

        System.out.println("----------------");

        Soldier soldier5 = new Soldier();
        soldier5.name = "Raj";
        soldier5.rank = "Sergeant";
        soldier5.age = 38;

        soldier5.attack();
        soldier5.defend();

        System.out.println("----------------");

        Soldier soldier6 = new Soldier();
        soldier6.name = "Manoj";
        soldier6.rank = "Corporal";
        soldier6.age = 29;

        soldier6.attack();
        soldier6.defend();
    }
}