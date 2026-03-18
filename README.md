# Data-Structures-Assignment-Two

This java program implements two data structures: a generic singly linked list and a stack using an ArrayList. 

The program performs the following:

1. Implements a generic singly linked list
    1. create a class 'SingleLinkedList<T>' that includes the following instance variables:
        1. head(first node)
        2. tail (last node)
        3. size (number of elements)
    2. create a private static 'Node' class that stores:
        1. data
        2. reference to the next node
    3. provide basic linked list methods
        1. add elements
            1. addFirst() adds an element to the front
            2. addLast() adds an element to the end
        2. remove elements
            1. removeFirst() removes the first element. If the list is empty, it returns null.
            2. removeLast() removes the last element. If the list is empty, it returns null.
        2. access elements
            1. getFirst() returns the first element. If the list is empty, return null.
            2. getLast() returns the last element. If the list is empty, return null.
        3. helper method
            1. isEmpty() checks if the list is empty
    4. supports index-based operations
        1. insert(index, item)
            1. inserts the element at the given index
            2. if index is <= 0, it inserts the element at front
            3. if index >= size, it inserts the element at the end
        2. remove(index)
            1. removes element at the given index
            2. returns true if successful
            3. returns false if index is out of bounds
        3. find(item)
            1. returns index of the first occurrence
            2. returns size if not found
2. Implement a stack using ArrayList
    1. create a class 'Stack' using ArrayList<Integer>
        1. The ArrayList follows LIFO behavior with the end of the ArrayList treated as the top of stack.
    2. provide stack methods
        1. push(item)
            1. adds value to the top of the stack
        2. pop()
            1. removes and returns top element
            2. if the stack is empty, the program throws an EmptyStackException
        3. peek()
            1. returns top element without removing it
            2. if the stack is empty, the program throws an EmptyStackException
        4. isEmpty()
            1. checks if the stack is empty
        5. size()
            1. returns number of elements
        6. average()
            1. calculates average of all the elements in the stack
3. Main method demonstration
    1. Create a stack object
    2. Check if the stack is empty
    3. Pushes multiple integer values (for example: 10,20,30,50,100)
    4. Pop one value and displays it(the expected element is 100)
    5. Display the top value using peek( the expected value is 50 after popping)
    6. Displays the average of all the elements in the stack 


Sample output (copy/paste of console output):

// create a stack object

Is the stack empty? true  //returns true because no elements have been pushed yet

// pushed elements: 10,20,30,50,100

Popped element: 100

Top element: 50

Average: 27.5


        
