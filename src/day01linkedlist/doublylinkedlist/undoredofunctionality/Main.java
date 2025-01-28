package day01linkedlist.doublylinkedlist.undoredofunctionality;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10); // Limit history to 10 states

        // Simulate typing and performing actions
        editor.addState("Hello");
        editor.addState("Hello, World");
        editor.addState("Hello, World!");
        editor.addState("Hello, Java World!");

        // Display current state
        editor.displayCurrentState();

        // Undo operations
        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        // Redo operations
        editor.redo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        // Add new state after undoing (clears redo history)
        editor.addState("Hello, Java! Edited");
        editor.displayCurrentState();

        // Display all states for debugging
        editor.displayAllStates();
    }
}
