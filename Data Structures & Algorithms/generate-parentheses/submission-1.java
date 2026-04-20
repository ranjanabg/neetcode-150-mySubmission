class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        backtrack(n, 0, 0, stack, result);

        return result;
    }

    public void backtrack(int n, int openP, int closeP, Stack<Character> stack, List<String> result) {
        if (openP == closeP && openP == n) {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }

        if (openP < n) {
            stack.push('(');
            backtrack(n, openP + 1, closeP, stack, result);
            stack.pop();
        }

        if (closeP < openP) {
            stack.push(')');
            backtrack(n, openP, closeP + 1, stack, result);
            stack.pop();
        }
    }
}
