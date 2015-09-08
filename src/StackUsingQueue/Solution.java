class MyStack {
    // Push element x onto stack.
    ArrayList<Integer> queue = new ArrayList<Integer>();
    ArrayList<Integer> queue1 = new ArrayList<Integer>();
    // Push element x onto stack.
    public void push(int x) 
    {
        queue.add(x);     
    }

    // Removes the element on top of the stack.
    public void pop() 
    {
        while(queue.size()>1) 
        {
            queue1.add(queue.get(0)); 
            queue.remove(0);
        }
        queue.remove(0);
        while(queue1.size()>0)
        {
            queue.add(queue1.get(0));
            queue1.remove(0);
        }
    }

    // Get the top element.
    public int top() 
    {
         while(queue.size()>1) 
        {
            queue1.add(queue.get(0)); 
            queue.remove(0);
        }
        int result = queue.get(0);
        queue1.add(queue.get(0));
        queue.remove(0);
        while(queue1.size()>0)
        {
            queue.add(queue1.get(0));
            queue1.remove(0);
        }
        return result;
    }

    // Return whether the stack is empty.
    public boolean empty() 
    {
        return queue.isEmpty(); 
    }
}
