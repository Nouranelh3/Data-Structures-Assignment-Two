public class SingleLinkedList<T>{

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    //default constructor
    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //PRE: item can be any type of data
    //POST: adds item to the front of the list and increase the size by 1
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    //PRE: item can be any type of data
    //POST: adds item to the end of the list and increase the size by 1
    public void addLast(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //removes the first item from the list and returns it. If the list is empty, it returns null.
    public T removeFirst() {
        if (isEmpty()) {
            return null; // or you can throw an exception
        }
        T data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    //removes the last item from the list and returns it. If the list is empty, it returns null.
    public T removeLast() {
        if (isEmpty()) {
            return null; // or you can throw an exception
        }
        if (size == 1){
            return removeFirst();
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        T data = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return data;
    
    }

    //returns the first item in the list. If the list is empty, it returns null.
    public T getFirst() {
        if (isEmpty()) {
            return null; 
        }
        return head.data;
    }

    //returns the last item in the list. If the list is empty, it returns null.
    public T getLast() {
        if (isEmpty()) {
            return null; 
        }
        return tail.data;
    }

    //return true if the list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }
    
    //PRE: index is an integer and item can be any type of data
    //POST: inserts item at the specified index in the list. If index is greater than the current size of the list, it adds item to the end of the list. If index is less than or equal to 0, it adds item to the front of the list. Also, the size of the list is increased by 1.
    public void insert(int index, T item) {
        if (index <= 0) {
            addFirst(item);
            return;
        }
        if (index >= size) {
            addLast(item);
            return;
        }
        Node<T> newNode = new Node<>(item);
        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    //PRE: index is an integer
    //POST: removes the item at the specified index in the list and returns true. If index is out of bounds, it returns false. Also, the size of the list is decreased by 1.
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false; // or you can throw an exception
        }
        if (index == 0) {
            removeFirst();
            return true;
        }
        if (index == size - 1) {
            removeLast();
            return true;
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    //PRE: item can be any type of data
    //POST: returns the index of the first occurrence of item in the list. If item is not found, it returns the size of the list.
    public int find(T item) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if ((item == null && current.data == null) || (item != null && item.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }
        return size; // return size if item is not found, indicating it's not in the list
    }




    
}
