package HW7.Task2;
//2. Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
// Написать метод для получения информации о количестве.
//класс заказов в интернет-магазине, в конструкторе класса производится подсчет количества объектов
public class Order {
    private static int orderAmount = 0;
    public Order() {
        orderAmount++;
    }
    private static int getOrderAmount() {
        return orderAmount;
    }

    public static void main(String[] args) {
        System.out.println("Количество заказов в начале работы программы " + getOrderAmount() + " штук.");
        for (int i = 0; i < 15; i++) {
            new Order();
        }
        System.out.println("Количество заказов в конце работы программы " + getOrderAmount() + " штук.");
    }
}