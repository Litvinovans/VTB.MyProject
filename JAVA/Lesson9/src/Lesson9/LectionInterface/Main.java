package Lesson9.LectionInterface;

public class Main {
    public static void main (String[] args){
        //Printable.read();
        Calculable c = new Calculator();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));

        waterPipe p = new waterPipe();
        p.printState(1);

        printer.Printable pp = createPrintable("Java",true);
        pp.print();
    }

    static void read(printer.Printable p) {
        p.print();
    }

    static printer.Printable createPrintable(String name, Boolean option) {
        if (option)
            return new Book(name, "undefied");
        else
            return new Journal(name);
    }

}
class printer {
    interface Printable {
        default void print() {
            System.out.println("printable");
            read();
        };

        private static void read() {
            System.out.println("read something");
        }
    }
}

interface Seacheable {
    default void search() {
        System.out.println("search");
    };

    private static void read() {
        System.out.println("read something");
    }
}

class Book implements printer.Printable,Seacheable {
    String title;
    String author;

    Book (String title, String author) {
        this.title=title;
        this.author=author;
    }

    public  void print(){
        System.out.println(title+" "+author);
    }
}

class Journal implements printer.Printable, Seacheable {
    String title;

    Journal (String title) {
        this.title=title;
    }
    /*public  void print(){
        System.out.println(title);
    }*/
}

interface BookPrintable extends printer.Printable{
    void paint();
}

interface Calculable {
    default int sum (int a, int b) {
        return sumAll(a,b);
    }
    default int sum (int a, int b, int c){
        return sumAll(a,b,c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for(int a:values)
            result+=a;

        return result;
    }
}

class Calculator implements Calculable{}

interface Stateable{
    int OPEN=1;
    int CLOSE=0;

    void printState(int n);
}

class waterPipe implements Stateable{
    public void printState(int n) {
        switch (n){
            case CLOSE: System.out.println("stops"); break;
            case OPEN: System.out.println("flows"); break;
            default: System.out.println("state is undefined");
        }
    }
}