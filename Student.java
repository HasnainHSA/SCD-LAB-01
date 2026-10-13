public class Student {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Ali", 75);
        s.displayResult();
    }
}