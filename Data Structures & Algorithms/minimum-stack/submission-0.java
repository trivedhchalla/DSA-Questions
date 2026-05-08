class MinStack {
    public Deque<Integer> stack;
    public Deque<Integer> minStack;
        int min;
    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        updateMin(val);
    }
    
    private void updateMin(int val){
        if(val > min){
            return ;
        }else{
            minStack.push(val);
            min = val;
        }
    }

    public void pop() {
        int val = stack.pop();
        updateRMin(val);
    }
    
    private void updateRMin(int val){
        if(val == min){
            minStack.pop();
            min = minStack.peek();
            return ;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
