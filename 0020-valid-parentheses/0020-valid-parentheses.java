class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{//means it is closing bracket
                if(stack.isEmpty()) return false; //it has closing bracket but no opening bracket
                else{
                    char top = stack.peek();
                    stack.pop();

                    if(ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '['){
                        //it's okay but do nothing
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}