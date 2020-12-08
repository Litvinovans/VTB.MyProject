package Lesson04.Task1;

public class Main {

    public static void main(String[] args) {
        //toLeft();
        int[] array = new int[9];
        // заполняем массив array числами
        System.out.println("Начальный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
            System.out.print(array[i]+" ");
        }
        System.out.println();

        MyReverseArray(array);

        // печатаем новый массив
        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length; i++) System.out.print(array[i]+" ");
    }

    private static void MyReverseArray(int[] array) {
        int temp;
        if (array.length % 2 == 0) {
            for (int i = 0; i < (array.length / 2); i++) {
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
        else {
            for (int i = 0; i < (array.length / 2-1); i++) {
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }
}
