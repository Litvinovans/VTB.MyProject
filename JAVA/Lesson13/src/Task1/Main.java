package Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//ДЗ 11. Кассовый чек
public class Main {
    public static void main(String[] args) {
        String s;
        int i = 1;
        String name="";
        double amount = 0;
        double price = 0;
        double finalprice = 0;
        double wholeprice = 0;
        double scale = Math.pow(10, 2);
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/natalia/Desktop/JAVA/Lesson13/products.txt")))
        {
            while((s=br.readLine())!=null){
                switch (i) {
                    case (1):
                        name=s;
                        i++;
                        break;
                    case (2):
                        amount=Double.parseDouble(s);
                        i++;
                        break;
                    case (3):
                        price=Double.parseDouble(s);
                        finalprice = Math.ceil((amount * price)*scale) / scale;
                        wholeprice = wholeprice + finalprice;
                        System.out.printf("%-15s %9.2f x %6.3f =%11.2f\n",name,price,amount,finalprice);
                        i=1;
                        break;
                }
            }
        }
        catch(IOException e){

            System.out.println(e.getMessage());
        }
        System.out.print("===============================================\n");
        System.out.printf("Итого: %40.2f",wholeprice);
    }
}
