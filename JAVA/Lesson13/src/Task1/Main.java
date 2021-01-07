package Task1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//ДЗ 11. Кассовый чек
public class Main {
    public static void main(String[] args) {
        String ss = "";
        double amount = 0;
        double price = 0;
        double finalprice = 0;
        double wholeprice = 0;
        double scale = Math.pow(10, 2);
        System.out.print("Наименование         Цена   Кол-во    Стоимость\n");
        System.out.print("===============================================\n");
        try {
            Scanner sc = new Scanner(new File("/Users/natalia/Desktop/JAVA/Lesson13/products.txt"));
            while (sc.hasNext()) {
                ss = sc.nextLine();
                if (sc.hasNextDouble()) {
                    amount = sc.nextDouble();
                }
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                }
                finalprice = Math.ceil((amount * price)*scale) / scale;
                wholeprice = wholeprice + finalprice;
                System.out.printf("%-15s %9.2f x %6.3f =%11.2f\n",ss,price,amount,finalprice);
                ss = sc.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("===============================================\n");
        System.out.printf("Итого: %40.2f",wholeprice);
    }
}
