public class Mobile {

    static void register(String patientName, String symptom, String email, long mobile) {
        System.out.println("Mobile App Registration Successful!");
        System.out.println("Patient: " + patientName);
		System.out.println("------------------------------------");
        Reception.book(patientName, symptom, email, mobile);
		System.out.println("------------------------------------");
		
    }
}
