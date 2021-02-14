package Lesson20.Task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Receipt> myArrayList = new ArrayList<Receipt>();
        String s;
        int i = 1;
        String name = "";
        double amount = 0;
        double price = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/natalia/Desktop/JAVA/Lesson13/products.txt"))) {
            while ((s = br.readLine()) != null) {
                switch (i) {
                    case (1):
                        name = s;
                        i++;
                        break;
                    case (2):
                        amount = Double.parseDouble(s);
                        i++;
                        break;
                    case (3):
                        price = Double.parseDouble(s);
                        i = 1;
                        myArrayList.add(new Receipt(name, amount, price));
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //посчитать количество товаров в чеке, стоимость которых больше заданной,
        System.out.println("Введите сумму для подсчета количества товаров в чеке, стоимость которых больше");
        Scanner sc = new Scanner(System.in);
        int tempPrice = sc.nextInt();
        System.out.printf("Количество товаров в чеке, стоимость которых больше %s руб. - "
                + myArrayList.stream().filter(n -> n.getPrice() > tempPrice).count() + "\n", tempPrice);

        //найти товар с минимальной ценой, вывести информацию о нем
        Receipt min = myArrayList.stream().min(Receipt::compare).get();
        System.out.println("MIN Name: " + min.getName() + " Price: " + min.getPrice() + " Amount: " + min.getAmount());

        //найти среднюю цену товаров
        System.out.println("Средняя цена товаров " + myArrayList.stream().mapToDouble(Receipt::getPrice).average().getAsDouble());
    }
}
