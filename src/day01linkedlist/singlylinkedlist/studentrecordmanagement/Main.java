package day01linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding some random student records
        studentList.addStudent(new Student(101, "Ankit", 20, "A"), 0);
        studentList.addStudent(new Student(102, "Anand", 22, "B"), 1);
        studentList.addStudent(new Student(103, "Aakrati", 19, "A+"), 2);
        studentList.addStudent(new Student(104, "Avinash", 21, "A"), 3);

        // Display all records
        studentList.displayStudents();

        // Search for a student record
        studentList.searchStudent(102);

        // Update a student's grade
        studentList.updateGrade(103, "B+");

        // Delete a student record
        studentList.deleteStudent(101);

        // Display all records after deletion
        studentList.displayStudents();
    }
}
