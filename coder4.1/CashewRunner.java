class CashewRunner{

    public static void main(String[] args){

        Grade g1 = new Grade("W180");
        Grade g2 = new Grade("W210");
        Grade g3 = new Grade("W240");
        Grade g4 = new Grade("W320");

        Cashew c1 = new Cashew(10, g1, CashewType.RAW);
        Cashew c2 = new Cashew(15, g2, CashewType.ROASTED);
        Cashew c3 = new Cashew(20, g3, CashewType.SALTED);
        Cashew c4 = new Cashew(25, g4, CashewType.ORGANIC);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();
    }
}