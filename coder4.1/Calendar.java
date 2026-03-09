class Calendar{

    int totalDays;       
    Month month;          
    CalendarType type;    

    Calendar(int totalDays, Month month, CalendarType type){
        this.totalDays = totalDays;
        this.month = month;
        this.type = type;
    }

    void printInfo(){

        System.out.println("---- Calendar Info ----");

        System.out.println("Total Days : " + this.totalDays);

        if(this.month != null){
            System.out.println("Month Name : " + this.month.name);
        }
        else{
            System.out.println("Month is null");
        }

        if(this.type != null){
            System.out.println("Calendar Type : " + this.type);
        }
        else{
            System.out.println("Type is null");
        }

        System.out.println("-----------------------");
    }
}