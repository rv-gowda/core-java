class Beer{

    int volume;        
    Brewery brewery;   
    BeerType type;     

    Beer(int volume, Brewery brewery, BeerType type){
        this.volume = volume;
        this.brewery = brewery;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Beer Info ----");

        System.out.println("Volume : " + this.volume);

        if(this.brewery != null){
            System.out.println("Brewery : " + this.brewery.breweryName);
        }
        else{
            System.out.println("Brewery is null");
        }

        if(this.type != null){
            System.out.println("Beer Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-------------------");
    }
}