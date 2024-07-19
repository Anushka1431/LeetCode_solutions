/* A deque is a double ended queue.it has the following operations-
addFirst(E e): Inserts e at the front.
addLast(E e): Inserts e at the end.
pollFirst(): Removes and returns the front element, or null if empty.
pollLast(): Removes and returns the last element, or null if empty.
peekFirst(): Returns the front element without removing it, or null if empty.
peekLast(): Returns the last element without removing it, or null if empty.
*/
class MyStack {
    Deque<Integer> q;
    public MyStack() {
        q=new ArrayDeque<>();
    }
    
    public void push(int x) {
        q.addFirst(x);
    }
    
    public int pop() {
        return q.pollFirst();
    }
    
    public int top() {
        return q.peekFirst();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */