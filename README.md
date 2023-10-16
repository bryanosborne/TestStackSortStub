# Program 5.1
Create a class named StackSort.  The class implements the StackSortInterface and uses either an ArrayStack or a LinkedStack.

Use the visualization worksheet to better understand the class and how it should function

![image](https://github.com/bryanosborne/TestStackSortStub/assets/22990921/51adb59f-d953-457d-96ad-2b6f3bc2f5d8)

public int addArray(int[] newArrayOfValues)

  A method to add an array of numbers to the Stack. When added, each integer will be put in the appropriate position in the stack structure. The method returns the number of values added.

public boolean addItem(int newValue);

  A method to add an integer to the Stack in the appropriate position. When added, the integer will be put in the appropriate position in the stack structure. The method returns true or false indicating success or failure of the action. 

public int[] toArray(String sortDirection)    

  A method to return an array of the integers in the Stack in ascending (ASC) or descending(DESC) order, as specified by the invocation.

Ensure your code is tested and documented well.
