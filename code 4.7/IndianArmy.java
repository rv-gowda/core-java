class IndianArmy extends Army {

    String chief;
    int regiments;
    String motto;
    double budget;
    boolean nuclearPower;

    void displayDetails() {
        System.out.println("Chief: " + chief);
        System.out.println("Regiments: " + regiments);
        System.out.println("Motto: " + motto);
        System.out.println("Budget: " + budget);
        System.out.println("Nuclear Power: " + nuclearPower);
    }
}