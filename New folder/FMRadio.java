class FMRadio {

    static void turnOnOrOff(boolean radioState) {

        System.out.println("The radio state is : " + radioState);

        if (radioState != true && radioState != false) {
            System.out.println("The data is invalid");
            return;
        }

        System.out.println("The data's are valid");
    }



    static void setFrequency(float frequency) {

        System.out.println("The frequency is : " + frequency);

        if (frequency < 88.0f) {
            System.out.println("The data is invalid");
            return;
        }

        if (frequency > 108.0f) {
            System.out.println("The data is invalid");
            return;
        }

        System.out.println("The data's are valid");
    }

    static void increaseVolume(int increment) {

        System.out.println("The increment value is : " + increment);

        if (increment <= 0) {
            System.out.println("The data is invalid");
            return;
        }

        if (increment > 10) {
            System.out.println("The data is invalid");
            return;
        }

        System.out.println("The data's are valid");
    }

    static void decreaseVolume(int decrement) {

        System.out.println("The decrement value is : " + decrement);

        if (decrement <= 0) {
            System.out.println("The data is invalid");
            return;
        }

        if (decrement > 10) {
            System.out.println("The data is invalid");
            return;
        }

        System.out.println("The data's are valid");
    }

    static void saveStation(String stationName) {

        System.out.println("The station name is : " + stationName);

        if (stationName == null) {
            System.out.println("The data is invalid");
            return;
        }

        if (stationName.isEmpty()) {
            System.out.println("The data is invalid");
            return;
        }

        System.out.println("The data's are valid");
    }

}