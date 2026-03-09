class HorlicksRunner{

    public static void main(String[] args){

        Flavor f1 = new Flavor("Chocolate");
        Flavor f2 = new Flavor("Vanilla");
        Flavor f3 = new Flavor("Malt");
        Flavor f4 = new Flavor("Strawberry");

        Horlicks h1 = new Horlicks(500, f1, HorlicksType.CHOCOLATE);
        Horlicks h2 = new Horlicks(400, f2, HorlicksType.CLASSIC);
        Horlicks h3 = new Horlicks(450, f3, HorlicksType.WOMEN);
        Horlicks h4 = new Horlicks(300, f4, HorlicksType.JUNIOR);

        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();
    }
}