package HW9.Task1;

import java.util.Scanner;

public class Agreement extends Document{

    public Agreement(){}

    public Agreement(int number, String date, String productlist) {
        super(number,date,productlist);
    }

    public int InputAgreementNumber () {
        System.out.println("Введите номер договора");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public String InputAgreementDate () {
        System.out.println("Введите дату договора в формате DD.MM.YYYY");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String InputAgreementProductList () {
        System.out.println("Введите перечень продуктов договора через разделить ;");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
