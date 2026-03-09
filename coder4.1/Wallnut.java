class Wallnut{

    int weight;          
    Shell shell;         
    WallnutType type;    

    Wallnut(int weight, Shell shell, WallnutType type){
        this.weight = weight;
        this.shell = shell;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Wallnut Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.shell != null){
            System.out.println("Shell Type : " + this.shell.shellType);
        }
        else{
            System.out.println("Shell is null");
        }

        if(this.type != null){
            System.out.println("Wallnut Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("----------------------");
    }
}