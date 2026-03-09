class Paneer{

    int weight;        
    Brand brand;       
    PaneerType type;  

    Paneer(int weight, Brand brand, PaneerType type){
        this.weight = weight;
        this.brand = brand;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Paneer Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.brand != null){
            System.out.println("Brand : " + this.brand.brandName);
        }
        else{
            System.out.println("Brand is null");
        }

        if(this.type != null){
            System.out.println("Paneer Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("---------------------");
    }
}