package HW9.Task1;

import java.util.Scanner;

public class Document {
    protected int number;
    protected String date;
    protected String productlist;

    public Document() {}

    public Document(int number, String date, String productlist) {
        this.number = number;
        this.date = date;
        this.productlist = productlist;
    }

    public String NumbertoString (int num) {
        return "№"+num;
    }
}
