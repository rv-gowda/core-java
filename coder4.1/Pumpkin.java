class Pumpkin{

    int weight;        
    Seed seed;        
    PumpkinType type;  

    Pumpkin(int weight, Seed seed, PumpkinType type){
        this.weight = weight;
        this.seed = seed;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Pumpkin Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.seed != null){
            System.out.println("Seed Count : " + this.seed.seedCount);
        }
        else{
            System.out.println("Seed is null");
        }

        if(this.type != null){
            System.out.println("Pumpkin Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("----------------------");
    }
