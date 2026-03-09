class Mushroom{

    int weight;        
    Farm farm;         
    MushroomType type; 

    Mushroom(int weight, Farm farm, MushroomType type){
        this.weight = weight;
        this.farm = farm;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Mushroom Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.farm != null){
            System.out.println("Farm Name : " + this.farm.farmName);
        }
        else{
            System.out.println("Farm is null");
        }

        if(this.type != null){
            System.out.println("Mushroom Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-----------------------");
    }
}