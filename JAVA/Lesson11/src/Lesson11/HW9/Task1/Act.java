package HW9.Task1;


import java.util.Scanner;

public class Act extends Document{

    public Act(){}

    public Act(int number, String date, String productlist) {
        super(number,date,productlist);
    }

    public int InputActNumber () {
        System.out.println("Введите номер акта");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public String InputActDate () {
        System.out.println("Введите дату акта в формате DD.MM.YYYY");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String InputActProductList () {
        System.out.println("Введите перечень продуктов акта через разделить ;");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
