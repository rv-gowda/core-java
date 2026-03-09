class CalendarRunner{

    public static void main(String[] args){

        Month m1 = new Month("January");
        Month m2 = new Month("February");
        Month m3 = new Month("March");
        Month m4 = new Month("April");

        Calendar c1 = new Calendar(31, m1, CalendarType.WALL);
        Calendar c2 = new Calendar(28, m2, CalendarType.DESK);
        Calendar c3 = new Calendar(31, m3, CalendarType.DIGITAL);
        Calendar c4 = new Calendar(30, m4, CalendarType.POCKET);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();
    }
}