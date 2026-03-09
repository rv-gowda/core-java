class WallnutRunner{

    public static void main(String[] args){

        Shell s1 = new Shell("Hard");
        Shell s2 = new Shell("Medium");
        Shell s3 = new Shell("Soft");
        Shell s4 = new Shell("Thin");

        Wallnut w1 = new Wallnut(10, s1, WallnutType.RAW);
        Wallnut w2 = new Wallnut(15, s2, WallnutType.ROASTED);
        Wallnut w3 = new Wallnut(20, s3, WallnutType.SALTED);
        Wallnut w4 = new Wallnut(25, s4, WallnutType.ORGANIC);

        w1.printInfo();
        w2.printInfo();
        w3.printInfo();
        w4.printInfo();
    }
}