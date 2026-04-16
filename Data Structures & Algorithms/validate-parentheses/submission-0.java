class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        Set<Character> open = new HashSet<>(Arrays.asList('(','{','['));
        while(i < s.length()){
            while(!stack.isEmpty()){
                char curr = s.charAt(i);
                if(open.contains(curr)){
                    stack.push(curr);
                }else if(curr == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(curr == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(curr == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
                i++;
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
