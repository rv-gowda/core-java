class BirdRunner {

    public static void main(String[] args) {

        String birdName = "Parrot";

        String color = Bird.getColorByName(birdName);
        int lifeSpan = Bird.getLifeSpanByName(birdName);

        System.out.println("----------------------------------");
        System.out.println("Bird Name : " + birdName);
        System.out.println("Color : " + color);
        System.out.println("Life Span : " + lifeSpan + " years");
    }
}