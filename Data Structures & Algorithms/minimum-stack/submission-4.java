class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minS;

    public MinStack() {
        stack = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if (minS.isEmpty() || val <= minS.peek()) {
            minS.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        if (minS.peek() == top) {
            minS.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
