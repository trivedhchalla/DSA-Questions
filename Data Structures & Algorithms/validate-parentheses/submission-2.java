class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        Set<Character> open = new HashSet<>(Arrays.asList('(','{','['));
        while(i < s.length()){
            char curr = s.charAt(i);
            if(open.contains(curr)){
                stack.push(curr);
            }else{
                if(stack.isEmpty()) return false;

                if(curr == ')' && stack.peek() == '('){
                stack.pop();
                }else if(curr == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(curr == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
