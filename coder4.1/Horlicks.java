class Horlicks{

    int weight;          
    Flavor flavor;      
    HorlicksType type;   
    Horlicks(int weight, Flavor flavor, HorlicksType type){
        this.weight = weight;
        this.flavor = flavor;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Horlicks Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.flavor != null){
            System.out.println("Flavor : " + this.flavor.flavorName);
        }
        else{
            System.out.println("Flavor is null");
        }

        if(this.type != null){
            System.out.println("Horlicks Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-----------------------");
    }
}