package HW9.Task1;

public class HelloWorld{
    public static boolean hello(String str) throws MyException {

        if (str.equals("Hello, World!")) {
            return true;
        }
        else {
            throw new MyException("Произошла ошибка - неверный текст в фразе");
        }
    }
}
