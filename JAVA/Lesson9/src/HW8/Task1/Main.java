package HW8.Task1;
//1. Написать абстрактный класс Animal с абстрактным методом getName.
// Сделать несколько классов животных, наследников Animal.
// Метод getName должен выводит название каждого животного.
//2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
// Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
// Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Матроскин");
        System.out.println(cat1.getName());
        cat1.actRun(cat1.getName());
        cat1.actSwim(cat1.getName());
        Dog dog1 = new Dog("Тузик");
        dog1.actRun(dog1.getName());
        dog1.actSwim(dog1.getName());
        System.out.println(dog1.getName());
        Duck duck1 = new Duck("Скрудж");
        System.out.println(duck1.getName());
        duck1.actFly(duck1.getName());
        duck1.actSwim(duck1.getName());
    }
}
