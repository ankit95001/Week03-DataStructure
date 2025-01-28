package day01linkedlist.singlylinkedlist.studentrecordmanagement;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}
