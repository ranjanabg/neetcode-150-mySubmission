class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backtrack(n, 0, 0, sb, result);

        return result;
    }

    private void backtrack(int n, int openP, int closeP, StringBuilder sb, List<String> result) {
        if (openP == n && openP == closeP) {
            result.add(sb.toString());
        }

        if (openP < n) {
            sb.append("(");
            backtrack(n, openP + 1, closeP, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (closeP < openP) {
            sb.append(")");
            backtrack(n, openP, closeP + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
