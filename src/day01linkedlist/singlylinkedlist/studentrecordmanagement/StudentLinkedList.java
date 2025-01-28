package day01linkedlist.singlylinkedlist.studentrecordmanagement;

class StudentLinkedList {
    private Node head;

    // Add a new student record
    public void addStudent(Student student, int position) {
        Node newNode = new Node(student);

        if (position == 0 || head == null) { // Add at the beginning or if the list is empty
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int index = 0;

            while (current.next != null && index < position - 1) {
                current = current.next;
                index++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        System.out.println("Student added successfully.");
    }

    // Delete a student record by Roll Number
    public void deleteStudent(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.student.rollNumber == rollNumber) { // Deleting the head
            head = head.next;
            System.out.println("Student record deleted successfully.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.student.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student record not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student record deleted successfully.");
        }
    }

    // Search for a student record by Roll Number
    public void searchStudent(int rollNumber) {
        Node current = head;
        while (current != null) {
            if (current.student.rollNumber == rollNumber) {
                System.out.println("Record Found: " + current.student);
                return;
            }
            current = current.next;
        }
        System.out.println("Student record not found.");
    }

    // Display all student records
    public void displayStudents() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Node current = head;
        System.out.println("Student Records:");
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }

    // Update a student's grade based on their Roll Number
    public void updateGrade(int rollNumber, String newGrade) {
        Node current = head;
        while (current != null) {
            if (current.student.rollNumber == rollNumber) {
                current.student.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            current = current.next;
        }
        System.out.println("Student record not found.");
    }
}
