package Task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;


//ДЗ 11. Кассовый чек + ДЗ 12 Логгирование
public class Main {
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        MyReadPrintFile("/Users/natalia/Desktop/JAVA/Lesson13/products.txt",1);
        MyReadPrintFile("/Users/natalia/Desktop/JAVA/Lesson13/products1.txt",2);
    }

    static void MyReadPrintFile(String str,int a){
        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try {
            FileHandler fh = new FileHandler("/Users/natalia/Desktop/JAVA/Lesson13/log"+a+".txt");
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh);
        } catch (IOException e){
            logr.log(Level.ALL,"Логгирование не работает",e);
        }
        logr.log(Level.INFO,"*******Начало работы программы*******");
        String s;
        int i = 1;
        int positionAmount = 0;
        String name="";
        double amount = 0;
        double price = 0;
        double finalprice = 0;
        double wholeprice = 0;
        double scale = Math.pow(10, 2);
        try(BufferedReader br = new BufferedReader(new FileReader(str)))
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
                        positionAmount++;
                        logr.log(Level.INFO,"Прочитана позиция чека № "+positionAmount+"\n");
                        price=Double.parseDouble(s);
                        finalprice = Math.ceil((amount * price)*scale) / scale;
                        wholeprice = wholeprice + finalprice;
                        System.out.printf("%-15s %9.2f x %6.3f =%11.2f\n",name,price,amount,finalprice);
                        logr.log(Level.INFO,"Позиция чека № "+positionAmount+" распечатана на консоль успешно!\n");
                        i=1;
                        break;
                }
            }
            System.out.print("===============================================\n");
            System.out.printf("Итого: %40.2f\n",wholeprice);
            logr.log(Level.INFO,"Финальная сумма чека выведена на консоль!");
        }
        catch(IOException e){
            logr.log(Level.SEVERE,e.getMessage());
            System.out.println(e.getMessage());
        }
        logr.log(Level.INFO,"*******Конец работы программы*******");
    }
}
