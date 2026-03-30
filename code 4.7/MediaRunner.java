class MediaRunner {

    public static void main(String[] args) {
        SocialMedia media1 = new SocialMedia();
        media1.type = "Online";
        media1.language = "English";
        media1.rating = 4.5;

        media1.platformName = "Instagram";
        media1.users = 2000000000;
        media1.verifiedAccounts = true;
        media1.dailyActiveUsers = 1500000000;
        media1.headquarters = "USA";

        media1.publish();
        media1.broadcast();
        media1.displayDetails();

        System.out.println("----------------");

        SocialMedia media2 = new SocialMedia();
        media2.type = "Online";
        media2.language = "Multiple";
        media2.rating = 4.2;

        media2.platformName = "Twitter";
        media2.users = 500000000;
        media2.verifiedAccounts = true;
        media2.dailyActiveUsers = 300000000;
        media2.headquarters = "USA";

        media2.publish();
        media2.broadcast();
        media2.displayDetails();

        System.out.println("----------------");

        Media media3 = new SocialMedia();
        media3.type = "Online";
        media3.language = "English";
        media3.rating = 4.0;

        media3.publish();
        media3.broadcast();

        System.out.println("----------------");

        Media media4 = new SocialMedia();
        media4.type = "Online";
        media4.language = "Spanish";
        media4.rating = 3.9;

        media4.publish();
        media4.broadcast();

        System.out.println("----------------");

        Media media5 = new Media();
        media5.type = "TV";
        media5.language = "Hindi";
        media5.rating = 4.1;

        media5.publish();
        media5.broadcast();

        System.out.println("----------------");

        Media media6 = new Media();
        media6.type = "Radio";
        media6.language = "Kannada";
        media6.rating = 3.8;

        media6.publish();
        media6.broadcast();
    }
}