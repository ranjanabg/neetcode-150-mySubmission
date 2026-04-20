class MinStack {

    List<Integer> stack;

    public MinStack() {
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(0, val);
    }
    
    public void pop() {
        stack.remove(0);
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int getMin() {
        int minValue = Integer.MAX_VALUE;

        for (int value : stack) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
