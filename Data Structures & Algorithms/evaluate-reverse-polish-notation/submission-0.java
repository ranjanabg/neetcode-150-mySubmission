class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();


        for (String s : tokens) {

            switch (s) {
                case "+" :
                    stack.push(stack.pop() + stack.pop());
                break;
                case "-" :
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                break;
                case "*" :
                    stack.push(stack.pop() * stack.pop());
                break;
                case "/" :
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                break;
                default :
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
