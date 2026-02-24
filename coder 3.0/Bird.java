class Bird {

    static String getColorByName(String name) {

        System.out.println("Executing getColorByName of the Bird");
        System.out.println("Bird Name : " + name);

        if (name == null) {
            System.out.println("Name can't be null");
            return null;
        }

        if (name == "Peacock") {
            return "Blue";
        }

        if (name == "Owl") {
            return "Brown-White";
        }

        if (name == "Crow") {
            return "Black";
        }

        if (name == "Ostrich") {
            return "Cream";
        }

        if (name == "Parrot") {
            return "Green";
        }

        if (name == "Sparrow") {
            return "Brown & Grey";
        }

        if (name == "Kingfisher") {
            return "Blue & Orange";
        }

        if (name == "Eagle") {
            return "Brown";
        }

        if (name == "Duck") {
            return "White";
        }

        if (name == "Swan") {
            return "White";
        }

        if (name == "Woodpecker") {
            return "Black, White & Red";
        }

        if (name == "Robin") {
            return "Brown";
        }

        if (name == "BlueJay") {
            return "Blue & White";
        }

        if (name == "Heron") {
            return "Grey";
        }

        if (name == "Toucan") {
            return "Black with Yellow & Orange beak";
        }

        if (name == "HummingBird") {
            return "Green & Red";
        }

        if (name == "Canary") {
            return "Yellow";
        }

        if (name == "Flamingo") {
            return "Pink";
        }

        if (name == "Cardinal") {
            return "Bright Red";
        }

        if (name == "Penguin") {
            return "Black & White";
        }

        System.out.println(name + " is not matching the DataBase");
        return null;
    }

    static int getLifeSpanByName(String name) {

        System.out.println("Executing getLifeSpanByName of the Bird");
        System.out.println("Bird Name : " + name);

        if (name == null) {
            System.out.println("Name can't be null");
            return -1;
        }

        if (name == "Peacock") {
            return 20;
        }

        if (name == "Owl") {
            return 25;
        }

        if (name == "Crow") {
            return 15;
        }

        if (name == "Ostrich") {
            return 40;
        }

        if (name == "Parrot") {
            return 50;
        }

        if (name == "Sparrow") {
            return 5;
        }

        if (name == "Kingfisher") {
            return 6;
        }

        if (name == "Eagle") {
            return 30;
        }

        if (name == "Duck") {
            return 10;
        }

        if (name == "Swan") {
            return 20;
        }

        if (name == "Woodpecker") {
            return 12;
        }

        if (name == "Robin") {
            return 8;
        }

        if (name == "BlueJay") {
            return 7;
        }

        if (name == "Heron") {
            return 15;
        }

        if (name == "Toucan") {
            return 20;
        }

        if (name == "HummingBird") {
            return 5;
        }

        if (name == "Canary") {
            return 10;
        }

        if (name == "Flamingo") {
            return 30;
        }

        if (name == "Cardinal") {
            return 15;
        }

        if (name == "Penguin") {
            return 20;
        }

        System.out.println(name + " is not matching the DataBase");
        return 0;
    }

}