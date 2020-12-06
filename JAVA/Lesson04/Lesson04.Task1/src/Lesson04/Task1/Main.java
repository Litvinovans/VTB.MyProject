package Lesson04.Task1;

public class Main {

    public static void main(String[] args) {
	// Написать программу для поиска минимального из двух чисел.
        System.out.println("Lesson04.Task1");
        int i1=7;
        int i2=6;
        if (i1<i2) {System.out.println("Min number is i1="); System.out.println(i1);}
        else {System.out.println("Min number is i2=");System.out.println(i2);}
    //_________________________________________________________________________________________________
    // Написать программу, которая описывает введенное число.
    // Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
        System.out.println("Lesson04.Task2");
        int j=-3;
        if ((j<0) && (j%2 == 0)) System.out.println("Число отрицательное и четное");
        else
            if ((j>0) && (j%2==0)) System.out.println("Число положительное и четное");
            else
                if ((j<0) && (j%2!=0)) System.out.println("Число отрицательное и нечетное");
                else
                    if ((j>0) && (j%2!=0)) System.out.println("Число положительное и нечетное");
                    else
                        System.out.println("Число равно 0");
    //_________________________________________________________________________________________________
    // Написать программу для вывода на экран таблицы умножения.
        System.out.println("Lesson04.Task3");

    // Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
        System.out.println("Lesson04.Task4");
    }
}
