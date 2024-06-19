class MyStack {
   private Queue<Integer> myQueue= new LinkedList<>();
   
    public MyStack() {
        
    }
    
    public void push(int x) {
         myQueue.add(x);
        for(int i=0;i<myQueue.size()-1;i++){
            myQueue.add(myQueue.remove());
        }
            
        }
        
    
    
    public int pop() {
         return myQueue.remove();
    }
    
    public int top() {
        return myQueue.peek();
    }
    
    public boolean empty() {
        return myQueue.isEmpty();
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