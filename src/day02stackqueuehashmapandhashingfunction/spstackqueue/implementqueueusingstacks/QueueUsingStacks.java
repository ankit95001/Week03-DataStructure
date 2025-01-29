package day02stackqueuehashmapandhashingfunction.spstackqueue.implementqueueusingstacks;

import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();

    public void enqueue(int data) {
        enqueueStack.push(data);
    }

    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            if (enqueueStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // 2
    }
}
