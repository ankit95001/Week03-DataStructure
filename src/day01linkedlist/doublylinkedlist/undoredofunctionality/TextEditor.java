package day01linkedlist.doublylinkedlist.undoredofunctionality;

class TextEditor {
    private Node head, tail, currentState;
    private int size, maxSize;

    // Constructor to initialize the text editor with a maximum history size
    public TextEditor(int maxSize) {
        this.head = null;
        this.tail = null;
        this.currentState = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Add a new state to the list
    public void addState(String newText) {
        Node newNode = new Node(newText);

        // If currentState is not the tail, clear redo history
        if (currentState != null && currentState.next != null) {
            currentState.next = null;
            tail = currentState;
        }

        // Add the new state at the end
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        currentState = tail;
        size++;

        // Ensure the size of the history doesn't exceed maxSize
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo functionality: Move to the previous state
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
        } else {
            System.out.println("No more states to undo.");
        }
    }

    // Redo functionality: Move to the next state
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
        } else {
            System.out.println("No more states to redo.");
        }
    }

    // Display the current state of the text
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.text);
        } else {
            System.out.println("No state available.");
        }
    }

    // Display all states for debugging purposes
    public void displayAllStates() {
        Node temp = head;
        System.out.print("States: ");
        while (temp != null) {
            if (temp == currentState) {
                System.out.print("[" + temp.text + "] "); // Mark current state
            } else {
                System.out.print(temp.text + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
