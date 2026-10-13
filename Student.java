public class Student {
    String name;
    int rollNo;
    int marks;


    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

     
        char grade;
        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 65) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public static void main(String[] args) {
       
        Student s = new Student("Ali", 101, 75);
        s.displayResult();
    }
}
