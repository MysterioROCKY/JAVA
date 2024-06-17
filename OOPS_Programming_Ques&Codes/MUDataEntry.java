import java.io.*;
import java.util.StringTokenizer;

class Person {
    String name;
    String id;
    String role;

    public Person(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}

class Employee extends Person {
    double basicSalary;
    double allowances;
    double grossSalary;

    public Employee(String name, String id, double basicSalary, double allowances) {
        super(name, id, "Employee");
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        calculateGrossSalary();
    }

    public void calculateGrossSalary() {
        grossSalary = basicSalary + allowances;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
}

class Teacher extends Person {
    double salary;

    public Teacher(String name, String id, double salary) {
        super(name, id, "Teacher");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Student extends Person {
    int currentYear;
    double[] marks;
    int[] creditsEarned;

    public Student(String name, String id, int currentYear) {
        super(name, id, "Student");
        this.currentYear = currentYear;
        marks = new double[currentYear];
        creditsEarned = new int[currentYear];
    }

    public void addMarksAndCredits(int year, double marks, int credits) {
        this.marks[year - 1] = marks;
        this.creditsEarned[year - 1] = credits;
    }

    public double calculateCGPA() {
        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (int i = 0; i < currentYear; i++) {
            totalGradePoints += (marks[i] * creditsEarned[i]);
            totalCredits += creditsEarned[i];
        }

        return totalGradePoints / totalCredits;
    }
}

public class MUDataEntry {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("MUData.txt"));

            System.out.println("Enter the number of people at MU:");
            int numPeople = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numPeople; i++) {
                System.out.println("Enter details (Name, ID, Role) for person " + (i + 1));
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), ",");

                String name = tokenizer.nextToken().trim();
                String id = tokenizer.nextToken().trim();
                String role = tokenizer.nextToken().trim();

                if (role.equalsIgnoreCase("Employee")) {
                    System.out.println("Enter Basic Salary and Allowances for the employee:");
                    double basicSalary = Double.parseDouble(reader.readLine());
                    double allowances = Double.parseDouble(reader.readLine());

                    Employee employee = new Employee(name, id, basicSalary, allowances);
                    writer.write("Employee: " + employee.getName() + " (" + employee.getId() + ") - Gross Salary: " + employee.getGrossSalary() + "\n");
                } else if (role.equalsIgnoreCase("Student")) {
                    System.out.println("Enter current year for the student:");
                    int currentYear = Integer.parseInt(reader.readLine());

                    Student student = new Student(name, id, currentYear);
                    for (int year = 1; year <= currentYear; year++) {
                        System.out.println("Enter marks for year " + year + " for the student:");
                        double marks = Double.parseDouble(reader.readLine());
                        System.out.println("Enter credits earned for year " + year + " for the student:");
                        int credits = Integer.parseInt(reader.readLine());
                        student.addMarksAndCredits(year, marks, credits);
                    }
                    double cgpa = student.calculateCGPA();
                    writer.write("Student: " + student.getName() + " (" + student.getId() + ") - CGPA: " + cgpa + "\n");
                } else if (role.equalsIgnoreCase("Teacher")) {
                    System.out.println("Enter Salary for the teacher:");
                    double salary = Double.parseDouble(reader.readLine());

                    Teacher teacher = new Teacher(name, id, salary);
                    writer.write("Teacher: " + teacher.getName() + " (" + teacher.getId() + ") - Salary: " + teacher.getSalary() + "\n");
                } else {
                    System.out.println("Invalid role. Enter 'Employee', 'Student', or 'Teacher'.");
                    i--;
                }
            }

            writer.close();
            System.out.println("Data has been saved to MUData.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
