class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char cPop = stack.pop();

            switch(c) {
                case ')' :
                    if (cPop != '(') {
                        return false;
                    }
                break;
                case '}' :
                    if (cPop != '{') {
                        return false;
                    }
                break;
                case ']' :
                    if (cPop != '[') {
                        return false;
                    }
                break;

            }
        }

        return stack.size() == 0;
    }
}
