import java.util.ArrayList;

//Student class
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double gpa;

    // Constructor
    public Student(int id, String firstName, String lastName, String email, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gpa = gpa;
    }

    // Getter and setter methods for all attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", gpa=" + gpa + "]";
    }
}

// Student DataBase class
class StudentDatabase {
    private ArrayList<Student> students;

    public StudentDatabase() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public double calculateAverageGPA() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        return totalGPA / students.size();
    }

    public void displayStudentDetails() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
