class BalloonRunner {

    public static void main(String[] args) {

        
        AirBalloon balloon1 = new AirBalloon();
        balloon1.color = "Red";
        balloon1.shape = "Round";
        balloon1.price = 500;

        balloon1.capacity = 5;
        balloon1.pilotName = "John";
        balloon1.maxHeight = 3000;
        balloon1.touristRide = true;
        balloon1.location = "Goa";

        balloon1.inflate();
        balloon1.burst();
        balloon1.displayDetails();

        System.out.println("----------------");

        AirBalloon balloon2 = new AirBalloon();
        balloon2.color = "Blue";
        balloon2.shape = "Oval";
        balloon2.price = 700;

        balloon2.capacity = 4;
        balloon2.pilotName = "Alex";
        balloon2.maxHeight = 2500;
        balloon2.touristRide = true;
        balloon2.location = "Mysore";

        balloon2.inflate();
        balloon2.burst();
        balloon2.displayDetails();

        System.out.println("----------------");

       
        Balloon balloon3 = new AirBalloon();
        balloon3.color = "Green";
        balloon3.shape = "Round";
        balloon3.price = 600;

        balloon3.inflate();
        balloon3.burst();

        System.out.println("----------------");

        Balloon balloon4 = new AirBalloon();
        balloon4.color = "Yellow";
        balloon4.shape = "Oval";
        balloon4.price = 550;

        balloon4.inflate();
        balloon4.burst();

        System.out.println("----------------");

        Balloon balloon5 = new Balloon();
        balloon5.color = "Pink";
        balloon5.shape = "Round";
        balloon5.price = 300;

        balloon5.inflate();
        balloon5.burst();

        System.out.println("----------------");

        Balloon balloon6 = new Balloon();
        balloon6.color = "White";
        balloon6.shape = "Oval";
        balloon6.price = 350;

        balloon6.inflate();
        balloon6.burst();
    }
}