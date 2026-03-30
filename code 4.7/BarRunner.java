class BarRunner {

    public static void main(String[] args) {

        JuiceBar bar1 = new JuiceBar();
        bar1.name = "Fresh Juice Hub";
        bar1.location = "Bangalore";
        bar1.rating = 4.5;

        bar1.juiceVarieties = 25;
        bar1.freshFruits = true;
        bar1.specialJuice = "Mango Shake";
        bar1.workers = 6;
        bar1.dailySales = 5000;

        bar1.openBar();
        bar1.closeBar();
        bar1.displayDetails();

        System.out.println("----------------");

        JuiceBar bar2 = new JuiceBar();
        bar2.name = "Healthy Sip";
        bar2.location = "Mysore";
        bar2.rating = 4.2;

        bar2.juiceVarieties = 18;
        bar2.freshFruits = true;
        bar2.specialJuice = "Orange Juice";
        bar2.workers = 4;
        bar2.dailySales = 3500;

        bar2.openBar();
        bar2.closeBar();
        bar2.displayDetails();

        System.out.println("----------------");

        Bar bar3 = new JuiceBar();
        bar3.name = "Cool Drinks";
        bar3.location = "Hubli";
        bar3.rating = 4.0;

        bar3.openBar();
        bar3.closeBar();

        System.out.println("----------------");

        Bar bar4 = new JuiceBar();
        bar4.name = "Fruit World";
        bar4.location = "Davanagere";
        bar4.rating = 3.9;

        bar4.openBar();
        bar4.closeBar();

        System.out.println("----------------");

        Bar bar5 = new Bar();
        bar5.name = "Classic Bar";
        bar5.location = "Goa";
        bar5.rating = 4.3;

        bar5.openBar();
        bar5.closeBar();

        System.out.println("----------------");

        Bar bar6 = new Bar();
        bar6.name = "Night Bar";
        bar6.location = "Mumbai";
        bar6.rating = 4.1;

        bar6.openBar();
        bar6.closeBar();
    }
}