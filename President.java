public class President {

    static void govern() {
        System.out.println("President is governing...");
        callState();
    }

     static void callState() {
        System.out.println("President calls the State...");
        rules();
    }

    static void rules() {
        System.out.println("President makes rules...");
        check();
    }

    static void check() {
        System.out.println("President checks implementation...");
        callAdmin();
    }

    static void callAdmin() {
        System.out.println("President calls administration...");
        collect();
    }

    static void collect() {
        System.out.println("Administration collects data...");
        apply();
    }

    static void apply() {
        System.out.println("Applying government policies...");
        chain();
    }

    static void chain() {
        System.out.println("Maintaining command chain...");
        citizen();
    }

    static void citizen() {
        System.out.println("Citizens are informed...");
        follow();
    }

    static void follow() {
        System.out.println("Citizens follow the rules.");
    }
}
