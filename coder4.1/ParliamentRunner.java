class ParliamentRunner{

    public static void main(String[] args){

        Houses h1 = new Houses(2);
        Houses h2 = new Houses(3);

        Parliament p1 = new Parliament(545, h1, ParliamentType.LOKSABHA);
        Parliament p2 = new Parliament(250, h2, ParliamentType.RAJYASABHA);
        Parliament p3 = new Parliament(100, null, ParliamentType.JOINTSESSION);
        Parliament p4 = new Parliament(0, null, null);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}