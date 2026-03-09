class NapkinRunner{

    public static void main(String[] args){

        Tissue t1 = new Tissue(2);
        Tissue t2 = new Tissue(3);
        Tissue t3 = new Tissue(4);
        Tissue t4 = new Tissue(5);

        Napkin n1 = new Napkin(50, t1, NapkinType.PAPER);
        Napkin n2 = new Napkin(60, t2, NapkinType.CLOTH);
        Napkin n3 = new Napkin(70, t3, NapkinType.TISSUE);
        Napkin n4 = new Napkin(80, t4, NapkinType.WET);

        n1.printInfo();
        n2.printInfo();
        n3.printInfo();
        n4.printInfo();
    }
}