class University {

    static String getCoursesByCollegeName(String collegeName) {

        System.out.println("Executing getCoursesByCollegeName");
        System.out.println("College Name : " + collegeName);

        if (collegeName == null) {
            System.out.println("College name can't be null");
            return null;
        

        if (collegeName == "UVCE") {
            return "BE, ME, MTech";
        }

        if (collegeName == "Government Engineering College Hassan") {
            return "BE, Diploma";
        }

        if (collegeName == "Government Engineering College Chamarajanagar") {
            return "BE (Civil, CSE, ECE, Mechanical)";
        }

        if (collegeName == "Mysore Medical College") {
            return "MBBS, MD, MS";
        }

        if (collegeName == "Government Arts College Bangalore") {
            return "BA, BSc, BCom";
        }
		

        if (collegeName == "RVCE") {
            return "BE, MTech, MBA";
        }

        if (collegeName == "BMS College of Engineering") {
            return "BE, MTech, MCA";
        }

        if (collegeName == "MSRIT") {
            return "BE, MTech, MBA";
        }

        if (collegeName == "SJMIT") {
            return "BE (CSE, ISE, ECE, EEE, Mechanical, Civil), MBA, MTech";
        }

        if (collegeName == "PES University") {
            return "BTech, MTech, MBA";
        }

        if (collegeName == "Dayananda Sagar College") {
            return "BE, MBA, MCA";
        }

        if (collegeName == "CMR Institute of Technology") {
            return "BE, MTech";
        }

        System.out.println(collegeName + " is not found in Karnataka database");
        return null;
    }
}