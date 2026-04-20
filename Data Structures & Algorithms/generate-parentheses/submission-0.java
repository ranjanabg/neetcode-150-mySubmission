class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        backtrack(n, 0, 0, stack, result);
        return result;
    }

    public void backtrack(int n, int openN, int closeN, Stack<Character> stack, List<String> result) {

        if (openN == closeN && openN == n) {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }

        if (openN < n) {
            stack.push('(');
            backtrack(n, openN + 1, closeN, stack, result);
            stack.pop();
        }

        if (closeN < openN) {
            stack.push(')');
            backtrack(n, openN, closeN + 1, stack, result);
            stack.pop();
        }
    }
}
