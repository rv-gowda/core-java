class Fort{

    int age;          
    Places places;    
    FortType type;    

    Fort(int age, Places places, FortType type){
        this.age = age;
        this.places = places;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Fort Info ----");

        System.out.println("Age : " + this.age);

        if(this.places != null){
            System.out.println("Place : " + this.places.placeName);
        }
        else{
            System.out.println("Places is null");
        }

        if(this.type != null){
            System.out.println("Fort Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-------------------");
    }
}