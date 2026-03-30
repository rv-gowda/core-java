class SlideRunner {

    public static void main(String[] args) {

        WaterSlide slide1 = new WaterSlide();
        slide1.material = "Fiber";
        slide1.color = "Blue";
        slide1.height = 15;

        slide1.waterSpeed = 25;
        slide1.parkName = "Wonderla";
        slide1.safetyTube = true;
        slide1.capacity = 10;
        slide1.shape = "Spiral";

        slide1.slideDown();
        slide1.stopSlide();
        slide1.displayDetails();

        System.out.println("----------------");

        WaterSlide slide2 = new WaterSlide();
        slide2.material = "Plastic";
        slide2.color = "Red";
        slide2.height = 12;

        slide2.waterSpeed = 20;
        slide2.parkName = "FunWorld";
        slide2.safetyTube = true;
        slide2.capacity = 8;
        slide2.shape = "Straight";

        slide2.slideDown();
        slide2.stopSlide();
        slide2.displayDetails();

        System.out.println("----------------");

        Slide slide3 = new WaterSlide();
        slide3.material = "Fiber";
        slide3.color = "Yellow";
        slide3.height = 14;

        slide3.slideDown();
        slide3.stopSlide();

        System.out.println("----------------");

        Slide slide4 = new WaterSlide();
        slide4.material = "Metal";
        slide4.color = "Green";
        slide4.height = 10;

        slide4.slideDown();
        slide4.stopSlide();

        System.out.println("----------------");

        Slide slide5 = new Slide();
        slide5.material = "Plastic";
        slide5.color = "Pink";
        slide5.height = 8;

        slide5.slideDown();
        slide5.stopSlide();

        System.out.println("----------------");

        Slide slide6 = new Slide();
        slide6.material = "Wood";
        slide6.color = "Brown";
        slide6.height = 6;

        slide6.slideDown();
        slide6.stopSlide();
    }
}