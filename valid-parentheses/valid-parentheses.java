class Solution {
    public boolean isValid(String ss) {
        
        Stack<Character> s = new Stack<>();
        
        char[] ca = ss.toCharArray();
        
        for (char c : ca) {
            if (c == '(' || c == '{' || c == '[')
                s.push(new Character(c));
            else {
                if (s.isEmpty()) return false;
                char pop = s.pop();
                
                if (
                    (pop == '(' && c != ')') ||
                    (pop == '{' && c != '}') ||
                    (pop == '[' && c != ']')
                ) return false;
            }
                
        } return s.isEmpty();
    }
}