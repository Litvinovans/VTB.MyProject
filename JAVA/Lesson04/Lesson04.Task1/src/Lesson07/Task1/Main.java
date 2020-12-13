package Lesson07.Task1;
/*Используя полученные знания об объектно-ориентированном программировании смоделировать
какую-нибудь предметную область. Например: банк, университет, библиотека, склад, магазин, пруд и т.д.
Ограничения:
Минимум 3 класса
Наличие нескольких полей и методов
Использование модификаторов доступа
Использование принципов ООП*/

/*Моделирование предметной области: Банк.
Банк будет содержать
 */
//создаем начальный класс человека с ФИО и возрастом
class Person {
    String name;
    int age;
    public Person (String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void displayPerson(){
        System.out.println("Name: " + name + ", Age: " + age + " years.");
    }
}
//тип, определяющий долности сотрудников банка
enum Position {
    Director,
    Manager,
    Cashier,
    Accountant
}
//тип, описывающий в каких валютах возможно открытие счета в банке
enum Currency {
    RUB,
    USD,
    EUR
}
//класс сотрудников банка, который наследует класс человека и включает
// в себя дополнительные переменные (должность и срок работы в этой должности),
// конструктор класса и метод печати информации на экран
class Employee extends Person {
    int workExperience;
    Position p;

    Employee (String fio, int age, int workExp, Position p){
        super(fio);
        setAge(age);
        workExperience = workExp;
        this.p = p;
    }
    public void displayEmployee(){
        displayPerson();
        System.out.println("Work Experience " + workExperience + " at position " + p + ".");
    }
}
//класс описывает сотрудника банк, у которого в банке открыт счет (сотрудник является клиентом), с конструктором,
//методом печати информации на дисплей, методами пополнения и снятия денег со счета.
class vipClient extends Employee {
    String accountNumber;
    double money;
    Currency curr;

    vipClient (String clName, int clAge, int workE, Position p, String accNumber, double money, Currency curr) {
        super(clName,clAge,workE,p);
        accountNumber = accNumber;
        this.money = money;
        this.curr = curr;
    }

    public void displayVIPClient(){
        displayEmployee();
        System.out.println("Has an account " + accountNumber + " with " + money + " " + curr + ".");
    }
    public void addMoney (double addMoney) {
        money = money+addMoney;
    }
    public void withdrawMoney (double wdMoney) {
        if (money-wdMoney < 0)
            System.out.printf("It is not possible to withdraw %s from your account!\n",wdMoney);
        else
            money = money-wdMoney;
    }
}
public class Main {

    public static void main(String[] args){
        //инициализации объекта из класса Person
        System.out.println("person1");
        Person person1 = new Person("Иванов Иван Иванович");
        //использование методов класса Person
        person1.setAge(25);
        person1.displayPerson();
        System.out.println("person2");
        //инициализации объекта из класса Employee
        Employee person2 = new Employee(person1.getName(), person1.getAge(), 5, Position.Manager);
        person2.displayEmployee();
        System.out.println("person3");
        Employee person3 = new Employee("Петров Петр Петрович", 34, 15, Position.Director);
        person3.displayPerson();
        person3.displayEmployee();
        System.out.println("person4");
        //инициализации объекта из класса vipClient
        vipClient person4 = new vipClient(person1.getName(), person1.getAge(),
                30,Position.Accountant, "40817810100001234567",1000.01,Currency.RUB);
        person4.displayVIPClient();
        //Успешное пополнение счета person4
        System.out.println("Пополнение счета person4 с выводом информации на дисплей");
        person4.addMoney(500);
        person4.displayVIPClient();
        System.out.println("Успешное снятие денег со счета person4 с выводом информации на дисплей");
        person4.withdrawMoney(1000);
        person4.displayVIPClient();
        System.out.println("Неуспешное снятие денег со счета person4 с выводом информации на дисплей");
        person4.withdrawMoney(777);
        person4.displayVIPClient();
    }
}
