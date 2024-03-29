package teststacksort;

public interface StackInterface<T>
{
   /** Adds a new entry to the top of this stack*/
   public void push(T newEntry);
  
   /** Removes and returns this stack's top entry.
   @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop();
  
   /** Retrieves this stack's top entry.
   @throws  EmptyStackException if the stack is empty. */
   public T peek();
  
   /** Detects whether this stack is empty.
   @return  True if the stack is empty. */
   public boolean isEmpty();
  
   /** Removes all entries from this stack. */
   public void clear();

} 

