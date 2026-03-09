class DMartRunner{

    public static void main(String[] args){

        Ownership o1 = new Ownership("Radhakrishna Damani");
        Ownership o2 = new Ownership("Corporate Board");

        DMart d1 = new DMart(350, o1, DMartType.LARGE);
        DMart d2 = new DMart(200, o2, DMartType.MEDIUM);
        DMart d3 = new DMart(100, null, DMartType.SMALL);
        DMart d4 = new DMart(50, null, null);

        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
        d4.printInfo();
    }
}