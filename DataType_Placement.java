public class DataType_Placement {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.856;
        boolean isStudent = true;

        // Using format specifiers
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d years old%n", age);
        System.out.printf("GPA: %.2f%n", gpa); // Restricted to 2 decimal places
        System.out.printf("Is student? %b%n", isStudent);
    }
}

