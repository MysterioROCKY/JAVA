public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();

        Student student1 = new Student(56, "Dipyaman", "Roy", "royDipyam@gmail.com", 9.75);
        Student student2 = new Student(192, "Sanyam", "Agrawal", "sanyamagrawal876@gmail.com", 9.90);
        Student student3 = new Student(200, "Sheikh", "Ullah", "ubaidUllah@gmail.com", 9.60);

        database.addStudent(student1);
        database.addStudent(student2);
        database.addStudent(student3);

        System.out.println("All Students:");
        database.displayStudentDetails();

        System.out.println("\nAverage GPA: " + database.calculateAverageGPA());

        System.out.println("\nRemoving student with ID 2...");
        database.removeStudent(56);

        System.out.println("\nAll Students after removal:");
        database.displayStudentDetails();

        System.out.println("\nRetrieving student with ID 1:");
        Student retrievedStudent = database.getStudentById(192);
        if (retrievedStudent != null) {
            System.out.println(retrievedStudent);
        } else {
            System.out.println("Student not found.");
        }
    }
}
