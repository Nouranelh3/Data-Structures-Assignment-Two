import java.util.EmptyStackException;
import java.util.ArrayList;

public class IntStack {
    private ArrayList<Integer> list;

    //default constructor
    public IntStack() {
        this.list = new ArrayList<>();
    }

    //PRE: item is an integer
    //POST: adds item to the top of the stack
    public void push(int item) {
        list.add(item);
    }

    //removes the top item from the stack and returns it. If the stack is empty, it throws an exception.
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    //returns the top item from the stack without removing it. If the stack is empty, it throws an exception.
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    //returns true if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }


    //returns the number of items in the stack
    public int size() {
        return list.size();
    }

    //returns the average of all the items in the stack. If the stack is empty, it returns 0.
    public double average() {
        if (isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return (double) sum / list.size();
    }

}
