class MyQueue {
  ArrayList<Integer> stack = new ArrayList<Integer>();
    ArrayList<Integer> stack1 = new ArrayList<Integer>();

    // Push element x to the back of queue.
    public void push(int x) 
    {
        stack.add(x);     
    }

    // Removes the element from in front of queue.
    public void pop() 
    {
        while(stack.size()>0)
        {
            stack1.add(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
        stack1.remove(stack1.size()-1);
        while(stack1.size()>0)
        {
            stack.add(stack1.get(stack1.size()-1));
            stack1.remove(stack1.size()-1);
        }
    }

    // Get the front element.
    public int peek() 
    {
        while(stack.size()>0)
        {
            stack1.add(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
        int result = stack1.get(stack1.size()-1);
        while(stack1.size()>0)
        {
            stack.add(stack1.get(stack1.size()-1));
            stack1.remove(stack1.size()-1);
        }
        return result;
    }

    // Return whether the queue is empty.
    public boolean empty() 
    {
        return stack.isEmpty(); 
    }
}
