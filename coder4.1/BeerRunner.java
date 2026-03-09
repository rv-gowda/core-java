class BeerRunner{

    public static void main(String[] args){

        Brewery b1 = new Brewery("Kingfisher");
        Brewery b2 = new Brewery("Budweiser");
        Brewery b3 = new Brewery("Heineken");
        Brewery b4 = new Brewery("Corona");

        Beer beer1 = new Beer(500, b1, BeerType.LAGER);
        Beer beer2 = new Beer(650, b2, BeerType.ALE);
        Beer beer3 = new Beer(700, b3, BeerType.STOUT);
        Beer beer4 = new Beer(550, b4, BeerType.PILSNER);

        beer1.printInfo();
        beer2.printInfo();
        beer3.printInfo();
        beer4.printInfo();
    }
}