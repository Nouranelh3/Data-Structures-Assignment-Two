public class Main {
    public static void main(String[] args) {
        
        //Instantiating a Stack object
        IntStack stack = new IntStack();

        //calling isEmpty() method on the stack
        System.out.println("Is the stack empty? " + stack.isEmpty());  //expected output: true

        
        //calling push() method to add items to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.push(100);

        //calling pop() method to get and remove the top item of the stack
        System.out.println("Popped element: " + stack.pop());

        //calling peek() method to get the current top item of the stack without removing it
        System.out.println("Top element: " + stack.peek());

        //calling average() method to get the average of all the items in the stack
        System.out.println("Average: " + stack.average());
    }
    
}
