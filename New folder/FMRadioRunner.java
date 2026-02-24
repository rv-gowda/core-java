class FMRadioRunner {

    public static void main(String[] args) {

        FMRadio.turnOnOrOff(true);
        FMRadio.turnOnOrOff(false);

        System.out.println("-------------------");

        FMRadio.setFrequency(95.5f);
        FMRadio.setFrequency(107.9f);
        FMRadio.setFrequency(120.0f);   
        System.out.println("-------------------");


        FMRadio.increaseVolume(5);
        FMRadio.increaseVolume(15);    

        System.out.println("-------------------");

        FMRadio.decreaseVolume(3);
        FMRadio.decreaseVolume(20);    

        System.out.println("-------------------");

      
        FMRadio.saveStation("Radio Mirchi");
        FMRadio.saveStation("Red FM");
        FMRadio.saveStation("");      
    }
}