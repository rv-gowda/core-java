class UniversityRunner {

    public static void main(String[] args) {

        String collegeName = "SJMIT";

        String courses = University.getCoursesByCollegeName(collegeName);

        System.out.println("----------------------------------");
        System.out.println("College Name : " + collegeName);
        System.out.println("Courses Offered : " + courses);
    }
}