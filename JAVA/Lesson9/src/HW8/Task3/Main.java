package HW8.Task3;
//3. Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
// Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
public class Main {
    public static void main(String[] args) {
        Kid k1 = new Kid("Tom",5);
        if (k1.wearBoots()) {
            k1.actRun(k1.getName());
        }
        else
            System.out.println("Error!");
        if (k1.wearSwimsuit()) {
            System.out.println("Error! Детям запрещено плавать в бассейне!");
        }
         else {
             k1.actSwim(k1.getName());
        }

         Man m1 = new Man("Sam",30,1);
         m1.actRun(m1.getName());
         m1.actSwim(m1.getName());
        Man m2 = new Man("Mark",30,15);
        m2.actRun(m2.getName());
        m2.actSwim(m2.getName());
    }
}
