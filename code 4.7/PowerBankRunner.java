class PowerBankRunner {

    public static void main(String[] args) {

        FastChargePowerBank powerbank1 = new FastChargePowerBank();
        powerbank1.brand = "Mi";
        powerbank1.capacity = 20000;
        powerbank1.price = 1999;

        powerbank1.fastCharge = true;
        powerbank1.ports = 2;
        powerbank1.color = "Black";
        powerbank1.weight = 450;
        powerbank1.ledDisplay = true;

        powerbank1.chargeDevice();
        powerbank1.showPowerStatus();
        powerbank1.displayDetails();

        System.out.println("----------------");

        FastChargePowerBank powerbank2 = new FastChargePowerBank();
        powerbank2.brand = "Realme";
        powerbank2.capacity = 10000;
        powerbank2.price = 999;

        powerbank2.fastCharge = true;
        powerbank2.ports = 2;
        powerbank2.color = "Blue";
        powerbank2.weight = 350;
        powerbank2.ledDisplay = false;

        powerbank2.chargeDevice();
        powerbank2.showPowerStatus();
        powerbank2.displayDetails();

        System.out.println("----------------");

        PowerBank powerbank3 = new FastChargePowerBank();
        powerbank3.brand = "Samsung";
        powerbank3.capacity = 15000;
        powerbank3.price = 1499;

        powerbank3.chargeDevice();
        powerbank3.showPowerStatus();

        System.out.println("----------------");

        PowerBank powerbank4 = new FastChargePowerBank();
        powerbank4.brand = "Sony";
        powerbank4.capacity = 12000;
        powerbank4.price = 1299;

        powerbank4.chargeDevice();
        powerbank4.showPowerStatus();

        System.out.println("----------------");

        PowerBank powerbank5 = new PowerBank();
        powerbank5.brand = "Ambrane";
        powerbank5.capacity = 8000;
        powerbank5.price = 699;

        powerbank5.chargeDevice();
        powerbank5.showPowerStatus();

        System.out.println("----------------");

        PowerBank powerbank6 = new PowerBank();
        powerbank6.brand = "Boat";
        powerbank6.capacity = 10000;
        powerbank6.price = 899;

        powerbank6.chargeDevice();
        powerbank6.showPowerStatus();
    }
}