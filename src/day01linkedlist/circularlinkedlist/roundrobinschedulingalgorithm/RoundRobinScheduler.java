package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {
    private Node head;
    private int timeQuantum;

    // Constructor
    public RoundRobinScheduler(int timeQuantum) {
        this.head = null;
        this.timeQuantum = timeQuantum;
    }

    // Add a process at the end of the circular list
    public void addProcess(Process process) {
        Node newNode = new Node(process);
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

    // Remove a process by Process ID
    public void removeProcessById(int processId) {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Node temp = head, prev = null;
        do {
            if (temp.process.processId == processId) {
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
                System.out.println("Process with ID " + processId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate round-robin scheduling
    public void simulateScheduling() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Node temp = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        System.out.println("Starting Round Robin Scheduling...");

        while (head != null) {
            System.out.println("Executing: " + temp.process);

            if (temp.process.burstTime <= timeQuantum) {
                totalWaitingTime += temp.process.burstTime;
                totalTurnaroundTime += totalWaitingTime;
                System.out.println("Process " + temp.process.processId + " completed.");
                removeProcessById(temp.process.processId);
            } else {
                temp.process.burstTime -= timeQuantum;
                totalWaitingTime += timeQuantum;
                System.out.println("Process " + temp.process.processId + " has remaining Burst Time: " + temp.process.burstTime);
            }

            temp = temp.next;
            if (head == null) {
                break;
            }
        }

        System.out.println("Average Waiting Time: " + (totalWaitingTime / processCount));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / processCount));
    }

    // Display all processes in the circular queue
    public void displayAllProcesses() {
        if (head == null) {
            System.out.println("No processes available.");
            return;
        }

        Node temp = head;
        System.out.println("Processes:");
        do {
            System.out.println(temp.process);
            temp = temp.next;
        } while (temp != head);
    }
}