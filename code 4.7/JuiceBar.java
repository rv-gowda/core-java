class JuiceBar extends Bar {

    int juiceVarieties;
    boolean freshFruits;
    String specialJuice;
    int workers;
    double dailySales;

    void displayDetails() {
        System.out.println("Juice Varieties: " + juiceVarieties);
        System.out.println("Fresh Fruits: " + freshFruits);
        System.out.println("Special Juice: " + specialJuice);
        System.out.println("Workers: " + workers);
        System.out.println("Daily Sales: " + dailySales);
    }
}