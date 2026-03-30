class InstrumentRunner {

    public static void main(String[] args) {

        MusicalInstrument inst1 = new MusicalInstrument();
        inst1.name = "Piano";
        inst1.type = "Keyboard";
        inst1.price = 50000;

        inst1.brand = "Yamaha";
        inst1.material = "Wood";
        inst1.keys = 88;
        inst1.electric = true;
        inst1.weight = 150;

        inst1.play();
        inst1.stop();
        inst1.displayDetails();

        System.out.println("----------------");

        MusicalInstrument inst2 = new MusicalInstrument();
        inst2.name = "Guitar";
        inst2.type = "String";
        inst2.price = 15000;

        inst2.brand = "Fender";
        inst2.material = "Wood";
        inst2.keys = 6;
        inst2.electric = false;
        inst2.weight = 4;

        inst2.play();
        inst2.stop();
        inst2.displayDetails();

        System.out.println("----------------");

     
        Instrument inst3 = new MusicalInstrument();
        inst3.name = "Violin";
        inst3.type = "String";
        inst3.price = 8000;

        inst3.play();
        inst3.stop();

        System.out.println("----------------");

        Instrument inst4 = new MusicalInstrument();
        inst4.name = "Drum";
        inst4.type = "Percussion";
        inst4.price = 12000;

        inst4.play();
        inst4.stop();

        System.out.println("----------------");

        Instrument inst5 = new Instrument();
        inst5.name = "Flute";
        inst5.type = "Wind";
        inst5.price = 3000;

        inst5.play();
        inst5.stop();

        System.out.println("----------------");

        Instrument inst6 = new Instrument();
        inst6.name = "Tabla";
        inst6.type = "Percussion";
        inst6.price = 6000;

        inst6.play();
        inst6.stop();
    }
}