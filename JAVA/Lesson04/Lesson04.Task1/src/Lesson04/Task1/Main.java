package Lesson04.Task1;

public class Main {

    public static void main(String[] args) {
        toLeft();
    }

    public static void toLeft() {
        // заполняем массив array числами
        System.out.println("Начальный массив");
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        // сдвигаем элементы массива влево, последний элемент каждой строки заполняем 0
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                array[i][j] = array[i][j+1];
            }
            array[i][array.length-1] = 0;
        }
        // печатаем новый массив
        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
