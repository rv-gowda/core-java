class SpecialSoldier extends Soldier {

    String weapon;
    String missionType;
    int experienceYears;
    boolean nightVision;
    String unitName;

    void displayDetails() {
        System.out.println("Weapon: " + weapon);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Experience: " + experienceYears);
        System.out.println("Night Vision: " + nightVision);
        System.out.println("Unit Name: " + unitName);
    }
}