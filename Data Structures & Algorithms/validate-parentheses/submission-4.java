class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
                continue;
            }

            if (stack.size() == 0) {
                return false;
            }

            char comp = stack.pop();

            switch(c){
                case '}':
                    if (comp != '{') {
                        return false;
                    }
                break;
                case ']':
                    if (comp != '[') {
                        return false;
                    }
                break;
                case ')':
                    if (comp != '(') {
                        return false;
                    }
                break;
            }
        }
        return stack.size() == 0;
    }
}
