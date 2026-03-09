class {

    public static void main(String[] args){

        Farm f1 = new Farm("Green Farm");
        Farm f2 = new Farm("Nature Farm");
        Farm f3 = new Farm("Fresh Farm");
        Farm f4 = new Farm("Organic Farm");

        Mushroom m1 = new Mushroom(100, f1, MushroomType.BUTTON);
        Mushroom m2 = new Mushroom(120, f2, MushroomType.OYSTER);
        Mushroom m3 = new Mushroom(150, f3, MushroomType.SHIITAKE);
        Mushroom m4 = new Mushroom(180, f4, MushroomType.PORTOBELLO);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
    }
}