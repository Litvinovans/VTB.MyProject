package HW7.Task3;

//3. Реализовать два класса: договор и акт.
// В каждом сделать поля: номер, дата, список товаров (массив строк).
// Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
public class Main {
    public static void main(String[] args) {
        //создание договора
        int l=3;
        String[] list = new String[l];
        for (int i = 0; i < l; i++) {
            list[i] = "Товар_номер_"+(i+1);
        }
        Agreement agree1 = new Agreement(1,"12.12.2020",list);
        //вывод информации об объекте на экран
        agree1.display();
        //вывод информации о том, к какому классу принадлежит переменная
        System.out.println(agree1.getClass());
        //вызов метода конвертации договора в акт
        Act a2 = Convert.Convert_from_Agreement_to_Act(agree1);
        //вывод информации об объекте на экран
        a2.display();
        //вывод информации о том, к какому классу принадлежит переменная
        System.out.println(a2.getClass());
    }
}
