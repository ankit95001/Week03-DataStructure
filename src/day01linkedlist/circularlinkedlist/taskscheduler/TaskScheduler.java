package day01linkedlist.circularlinkedlist.taskscheduler;

class TaskScheduler {
    private Node head;

    // Constructor
    public TaskScheduler() {
        this.head = null;
    }

    // Add a task at the beginning
    public void addTaskAtBeginning(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to make it circular
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add a task at a specific position (1-based index)
    public void addTaskAtPosition(Task task, int position) {
        Node newNode = new Node(task);
        if (position == 1) {
            addTaskAtBeginning(task);
            return;
        }

        Node temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (count == position - 1) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Invalid position.");
        }
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head, prev = null;
        do {
            if (temp.task.taskId == taskId) {
                if (prev == null) { // Deleting the head
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (last == head) { // Only one node
                        head = null;
                    } else {
                        last.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("Current Task: " + head.task);
        head = head.next;
    }

    // Display all tasks starting from the head
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node temp = head;
        System.out.println("Tasks:");
        do {
            System.out.println(temp.task);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for tasks by Priority
    public void searchTasksByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Node temp = head;
        boolean found = false;
        do {
            if (temp.task.priority == priority) {
                System.out.println(temp.task);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }
}
