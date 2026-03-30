class OpenerRunner {

    public static void main(String[] args) {

        BottleOpener opener1 = new BottleOpener();
        opener1.material = "Steel";
        opener1.brand = "Prestige";
        opener1.price = 150;

        opener1.type = "Manual";
        opener1.stainlessSteel = true;
        opener1.weight = 0.2;
        opener1.color = "Silver";
        opener1.portable = true;

        opener1.open();
        opener1.close();
        opener1.displayDetails();

        System.out.println("----------------");

        BottleOpener opener2 = new BottleOpener();
        opener2.material = "Iron";
        opener2.brand = "Pigeon";
        opener2.price = 120;

        opener2.type = "Automatic";
        opener2.stainlessSteel = false;
        opener2.weight = 0.3;
        opener2.color = "Black";
        opener2.portable = true;

        opener2.open();
        opener2.close();
        opener2.displayDetails();

        System.out.println("----------------");

        Opener opener3 = new BottleOpener();
        opener3.material = "Steel";
        opener3.brand = "Milton";
        opener3.price = 180;

        opener3.open();
        opener3.close();

        System.out.println("----------------");

        Opener opener4 = new BottleOpener();
        opener4.material = "Aluminium";
        opener4.brand = "KitchenPro";
        opener4.price = 130;

        opener4.open();
        opener4.close();

        System.out.println("----------------");

        Opener opener5 = new Opener();
        opener5.material = "Plastic";
        opener5.brand = "Local";
        opener5.price = 50;

        opener5.open();
        opener5.close();

        System.out.println("----------------");

        Opener opener6 = new Opener();
        opener6.material = "Steel";
        opener6.brand = "Generic";
        opener6.price = 70;

        opener6.open();
        opener6.close();
    }
}