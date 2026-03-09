class Parliament{

    int members;         
    Houses houses;        
    ParliamentType type;  

    Parliament(int members, Houses houses, ParliamentType type){
        this.members = members;
        this.houses = houses;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Parliament Info ----");

        System.out.println("Members : " + this.members);

        if(this.houses != null){
            System.out.println("Total Houses : " + this.houses.totalHouses);
        }
        else{
            System.out.println("Houses is null");
        }

        if(this.type != null){
            System.out.println("Parliament Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-------------------------");
    }
}