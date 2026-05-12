class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(' ) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char p = stack.pop();

            switch (c) {
                case '}':
                    if (p != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (p != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (p != '(') {
                        return false;
                    }
                    break;
            }
        }

        return stack.size() == 0;
    }
}
