class FortRunner{

    public static void main(String[] args){

        Places p1 = new Places("Chitradurga Fort");
        Places p2 = new Places("Red Fort");

        Fort f1 = new Fort(400, p1, FortType.HILL);
        Fort f2 = new Fort(350, p2, FortType.LAND);
        Fort f3 = new Fort(200, null, FortType.SEA);
        Fort f4 = new Fort(100, null, null);

        f1.printInfo();
        f2.printInfo();
        f3.printInfo();
        f4.printInfo();
    }
}