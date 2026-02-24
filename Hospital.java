public class Hospital {

    static void bookAppointment(String patientName, String symptom) {
        System.out.println("Appointment booked for " + patientName + " for " + symptom);
        System.out.println("------------------------------------");
        Nurse.basicCheck(patientName, symptom, bp, sugar);
		System.out.println("------------------------------------");
    }
}
