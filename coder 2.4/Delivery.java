public class Delivery {

    public static void pickUp() {
        

        Market.storeVegetables();
        Market.storeGroceries();
        Market.storeFruits();
        Market.storeDryFruits();
        Market.storeJunkFood();
	System.out.println("Delivery person picking up items...");
    }
}
