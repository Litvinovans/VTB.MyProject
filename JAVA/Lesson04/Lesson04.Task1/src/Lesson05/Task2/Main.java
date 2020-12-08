package Lesson05.Task2;

public class Main {

    public static void main(String[] args) {
        int array_size=10; // размер массива
        int[] array = new int[array_size];
        System.out.println("Начальный массив");
        // заполнение массива данными
        for(int i = 0; i < array_size; ++i) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // функция по реверсу массива
        array = MyReverseArray(array);

        //вывод на печать преобразованного массива
       System.out.println("Преобразованный массив");
            for(int i = 0; i < array_size; ++i) {
                System.out.print(array[i] + " ");
            }
    }

    public static int[] MyReverseArray(int[] l_array){
        int temp;
        int local_arr_size = l_array.length;
        for (int i = 0; i < (local_arr_size / 2); i++) {
            temp = l_array[i];
            l_array[i] = l_array[local_arr_size - i - 1];
            l_array[local_arr_size - i - 1] = temp;
        }

        return l_array;
    }
}
