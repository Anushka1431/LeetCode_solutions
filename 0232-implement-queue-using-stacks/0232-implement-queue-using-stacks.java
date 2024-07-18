//creaye two stcks first and second. while adding push into one . while removing put everything from 1 to 2 stack and then pop from 2. this will result in a queue like activity. same goes for peek.

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();
        
    }
    
    public void push(int x) {
        
        first.push(x);
        
    }
    
    public int pop() {
        //first move from first to second
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        //pop it
        int removed=second.pop();
        //then put it back from second to first
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;        
    }    
    public int peek() {
        //first move from first to second
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        //pop it
        int peeked=second.peek();
        //then put it back from second to first
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked; 
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */