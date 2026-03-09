class Cashew{

    int weight;        
    Grade grade;       
    CashewType type;   

    Cashew(int weight, Grade grade, CashewType type){
        this.weight = weight;
        this.grade = grade;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Cashew Info ----");

        System.out.println("Weight : " + this.weight);

        if(this.grade != null){
            System.out.println("Grade : " + this.grade.gradeName);
        }
        else{
            System.out.println("Grade is null");
        }

        if(this.type != null){
            System.out.println("Cashew Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("---------------------");
    }
}