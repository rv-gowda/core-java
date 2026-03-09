class PumpkinRunner{

    public static void main(String[] args){

        Seed s1 = new Seed(50);
        Seed s2 = new Seed(60);
        Seed s3 = new Seed(70);
        Seed s4 = new Seed(80);

        Pumpkin p1 = new Pumpkin(10, s1, PumpkinType.SMALL);
        Pumpkin p2 = new Pumpkin(15, s2, PumpkinType.MEDIUM);
        Pumpkin p3 = new Pumpkin(20, s3, PumpkinType.LARGE);
        Pumpkin p4 = new Pumpkin(25, s4, PumpkinType.ORGANIC);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}Pumpkin