package day02stackqueuehashmapandhashingfunction.spstackqueue.sortstackusingrecursion;

import java.util.Stack;

class SortStackRecursively {
    public static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack);
            insertStack(stack,temp);
        }
    }

    private static void insertStack(Stack<Integer> stack, int element) {
        if(stack.isEmpty() || stack.peek()>=element){
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        insertStack(stack,element);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

