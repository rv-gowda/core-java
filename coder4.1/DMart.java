class DMart{

    int branches;          
    Ownership ownership;   
    DMartType type;       

    DMart(int branches, Ownership ownership, DMartType type){
        this.branches = branches;
        this.ownership = ownership;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- DMart Info ----");

        System.out.println("Branches : " + this.branches);

        if(this.ownership != null){
            System.out.println("Owner Name : " + this.ownership.ownerName);
        }
        else{
            System.out.println("Ownership is null");
        }

        if(this.type != null){
            System.out.println("DMart Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("--------------------");
    }
}