class Solution {
    public boolean isValid(String s) {
        Deque<Character> new_stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                new_stack.push(c);
            } else {
                if (new_stack.isEmpty()) {
                    return false;
                }
                char top = new_stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return new_stack.isEmpty();
    }
}
