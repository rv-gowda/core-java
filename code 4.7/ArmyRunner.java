class ArmyRunner {

    public static void main(String[] args) {

        
        IndianArmy indianArmy1 = new IndianArmy();
        indianArmy1.country = "India";
        indianArmy1.totalSoldiers = 1200000;
        indianArmy1.headquarters = "New Delhi";
        indianArmy1.chief = "General Manoj Pande";
        indianArmy1.regiments = 50;
        indianArmy1.motto = "Service Before Self";
        indianArmy1.budget = 5.5;
        indianArmy1.nuclearPower = true;

        indianArmy1.protectNation();
        indianArmy1.training();
        indianArmy1.displayDetails();

        System.out.println("------------------");

        IndianArmy indianArmy2 = new IndianArmy();
        indianArmy2.country = "India";
        indianArmy2.totalSoldiers = 1000000;
        indianArmy2.headquarters = "Delhi";
        indianArmy2.chief = "General X";
        indianArmy2.regiments = 45;
        indianArmy2.motto = "Victory";
        indianArmy2.budget = 4.8;
        indianArmy2.nuclearPower = true;

        indianArmy2.protectNation();
        indianArmy2.training();
        indianArmy2.displayDetails();

        System.out.println("------------------");

      
        Army army1 = new IndianArmy();
        army1.country = "India";
        army1.totalSoldiers = 900000;
        army1.headquarters = "Delhi";

        army1.protectNation();
        army1.training();

        System.out.println("------------------");

        Army army2 = new IndianArmy();
        army2.country = "India";
        army2.totalSoldiers = 850000;
        army2.headquarters = "Delhi";

        army2.protectNation();
        army2.training();

        System.out.println("------------------");

  
        Army army3 = new Army();
        army3.country = "India";
        army3.totalSoldiers = 800000;
        army3.headquarters = "Delhi";

        army3.protectNation();
        army3.training();

        System.out.println("------------------");

        Army army4 = new Army();
        army4.country = "India";
        army4.totalSoldiers = 700000;
        army4.headquarters = "Delhi";

        army4.protectNation();
        army4.training();
    }
}