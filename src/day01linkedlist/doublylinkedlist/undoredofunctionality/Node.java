package day01linkedlist.doublylinkedlist.undoredofunctionality;

class Node {
    String text;
    Node prev, next;

    public Node(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
