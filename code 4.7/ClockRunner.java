class ClockRunner {

    public static void main(String[] args) {

   
        DigitalClock clock1 = new DigitalClock();
        clock1.brand = "Casio";
        clock1.type = "Digital";
        clock1.price = 1500;

        clock1.battery = true;
        clock1.displayType = "LED";
        clock1.brightnessLevel = 8;
        clock1.color = "Black";
        clock1.bluetooth = false;

        clock1.showTime();
        clock1.setAlarm();
        clock1.displayDetails();

        System.out.println("----------------");

        DigitalClock clock2 = new DigitalClock();
        clock2.brand = "Sony";
        clock2.type = "Digital";
        clock2.price = 2000;

        clock2.battery = true;
        clock2.displayType = "LCD";
        clock2.brightnessLevel = 7;
        clock2.color = "White";
        clock2.bluetooth = true;

        clock2.showTime();
        clock2.setAlarm();
        clock2.displayDetails();

        System.out.println("----------------");

        Clock clock3 = new DigitalClock();
        clock3.brand = "Titan";
        clock3.type = "Wall";
        clock3.price = 1200;

        clock3.showTime();
        clock3.setAlarm();

        System.out.println("----------------");

        Clock clock4 = new DigitalClock();
        clock4.brand = "Ajanta";
        clock4.type = "Wall";
        clock4.price = 900;

        clock4.showTime();
        clock4.setAlarm();

        System.out.println("----------------");

     
        Clock clock5 = new Clock();
        clock5.brand = "Sonata";
        clock5.type = "Analog";
        clock5.price = 800;

        clock5.showTime();
        clock5.setAlarm();

        System.out.println("----------------");

        Clock clock6 = new Clock();
        clock6.brand = "Timex";
        clock6.type = "Analog";
        clock6.price = 1000;

        clock6.showTime();
        clock6.setAlarm();
    }
}