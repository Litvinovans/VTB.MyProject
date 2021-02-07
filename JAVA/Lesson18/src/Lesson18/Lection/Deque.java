package Lesson18.Lection;

public class Deque {

    private Node head;
    private Node tail;

    public Deque(){
        head = tail = null;
    }

    boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    int size(){
        if (isEmpty())
            return 0;
        else {
            Node temp = head;
            int i=0;
            while (temp!=null) {
                i++;
                temp = temp.next;
            }
            return i;
        }
    }

    void insert_first(char data){
        Node temp = new Node();
        temp.value = data;

        if (head==null){
            head = tail = temp;
            temp.next = temp.previous = null;
        }
        else {
            head.previous = temp;
            temp.next = head;
            temp.previous = null;
            head = temp;
        }
    }

    void insert_last(char data){
        Node temp = new Node();
        temp.value = data;

        if (head==null){
            head = tail = temp;
            temp.next = temp.previous = null;
        }
        else {
            tail.next = temp;
            temp.next = null;
            temp.previous = tail;
            tail = temp;
        }
    }

    void remove_first() {
        if (!isEmpty()) {
            if (size() == 1) {
                head = tail = null;
            }
            else {
            head = head.next;
            head.previous = null;
            return;}
        }
        else {
            System.out.println("Deque is already empty");
        }
    }

    void remove_last() {
        if (!isEmpty()) {
            if (size()==1){head = tail = null;}
            else {
                tail = tail.previous;
                tail.next = null;
            }
        }
        else {
            System.out.println("Deque is already empty");
        }
    }

    void display() {
        if (isEmpty())
        {
            System.out.println("Deque is empty");
        }
        else {
            Node temp = head;
            while (temp!=null)
            {
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
        }
    }
}
