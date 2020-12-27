package HW9.Task1;
//Заставить программу ”Hello, World!” упасть…
//Смоделировав ошибку «NullPointerException»
//Смоделировав ошибку «ArrayIndexOutOfBoundsException»
//Вызвав свой вариант ошибки через оператор throw

public class Main {

    public static void main(String[] args) {
        //Смоделировав ошибку «NullPointerException»
        String s = null;
        try { s.chars();}
        catch (NullPointerException ex){
            System.out.println("Произошла ошибка - NullPointerException");
        }
        //Смоделировав ошибку «ArrayIndexOutOfBoundsException»
        String[] s1 = new String[1];
        try {
            System.out.println(s1[1]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Произошла ошибка - ArrayIndexOutOfBoundsException");
        }
        //Вызвав свой вариант ошибки через оператор throw
        try{
            boolean result = HelloWorld.hello("Hello, My country!");
            System.out.println(result);
        }
        catch(MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
