package HW7.Task1;
//1. Реализовать класс Calculator, который будет содержать статические методы для операций вычитания,
// сложения, умножения, деления и взятия процента от числа.
// Класс должен работать как с целыми числами, так и с дробями.
public class Calculator {
    private static int x;
    private static int y;

    private static int addition(int x, int y) {
        return x + y;
    }

    private static int subtraction(int x, int y) {
        return x - y;
    }

    private static int multiplication(int x, int y) {
        return x * y;
    }

    private static double division(int x, int y) {
        return x / y;
    }

    private static int percent(int x, int y) {
        return (x * 100) / y;
    }

    public static void main(String[] args) {
        System.out.printf("Сложение двух целых чисел: %s и %s равно %s \n", 5, 6, addition(5, 6));
        System.out.printf("Вычитание двух целых чисел: %s и %s равно %s \n", 5, 6, subtraction(5, 6));
        System.out.printf("Умножение двух целых чисел: %s и %s равно %s \n", 5, 6, multiplication(5, 6));
        System.out.printf("Деление двух целых чисел: %s и %s равно %s \n", 36, 6, division(36, 6));
        System.out.printf("%s от %s есть %s процентов  \n", 5, 100, percent(5, 100));
    }
}
