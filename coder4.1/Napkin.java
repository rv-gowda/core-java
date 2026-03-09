class Napkin{

    int quantity;       
    Tissue tissue;      
    NapkinType type;    

    Napkin(int quantity, Tissue tissue, NapkinType type){
        this.quantity = quantity;
        this.tissue = tissue;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Napkin Info ----");

        System.out.println("Quantity : " + this.quantity);

        if(this.tissue != null){
            System.out.println("Tissue Layers : " + this.tissue.layers);
        }
        else{
            System.out.println("Tissue is null");
        }

        if(this.type != null){
            System.out.println("Napkin Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("---------------------");
    }
}