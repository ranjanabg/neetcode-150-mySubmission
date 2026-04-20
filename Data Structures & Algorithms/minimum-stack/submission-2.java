class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> minStack;
    public MinStack() {
        stack1 = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack1.isEmpty()) return;
        int top = stack1.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
