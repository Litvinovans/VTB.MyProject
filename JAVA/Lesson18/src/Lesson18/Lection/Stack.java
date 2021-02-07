package Lesson18.Lection;

public class Stack {
    Deque elements = new Deque();

    void Push(char Data) {
        elements.insert_first(Data);
    }

    int Size(){
        return elements.size();
    }

    void Pop(){
        elements.remove_first();
    }

    void Display(){
        elements.display();
    }

    boolean StkIsEmpty() {
        return elements.isEmpty();
    }
}
