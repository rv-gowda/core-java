class PaneerRunner{

    public static void main(String[] args){

        Brand b1 = new Brand("Amul");
        Brand b2 = new Brand("Nandini");
        Brand b3 = new Brand("Milky Mist");
        Brand b4 = new Brand("Mother Dairy");

        Paneer p1 = new Paneer(200, b1, PaneerType.FRESH);
        Paneer p2 = new Paneer(250, b2, PaneerType.ORGANIC);
        Paneer p3 = new Paneer(300, b3, PaneerType.MALAI);
        Paneer p4 = new Paneer(150, b4, PaneerType.PACKED);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
    }
}