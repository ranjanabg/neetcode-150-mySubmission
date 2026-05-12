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
        } else {
            minS.push(minS.peek());
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        stack.pop();
        minS.pop();

        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {

        if (minS.isEmpty()) {
            return 0;
        }

        return minS.peek();
    }
}
