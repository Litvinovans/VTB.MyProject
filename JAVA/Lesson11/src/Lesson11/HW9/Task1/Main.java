package HW9.Task1;
//Написать программу, которая будет считывать документы (акты и договора) с консоли,
// сохранять их в массив и выводить конкретный документ по запросу:
// 1) Предусмотреть ввод информации: количество считываемых документов, для каждого документа
// - тип и необходимую информацию.
// 2) Документы хранить в общем массиве (Подумать про использование полиморфизма)
// 3) Предусмотреть вывод конкретного i-го документа на консоль. Для этого написать перегрузку метода toString().
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество элементов");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i>0) {
            String[][] st = new String[i][4];
            for (int j = 0; j < i; j++) {
                System.out.printf("Выберите цифру типа документа № %s: 1 - Договор, 2 - Акт",j+1);
                System.out.println();
                int n = sc.nextInt();
                switch (n) {
                    case (1): {
                        st[j][0] = "Договор";
                        Agreement agreement = new Agreement();
                        st[j][1] = agreement.NumbertoString(agreement.InputAgreementNumber());
                        st[j][2] = agreement.InputAgreementDate();
                        st[j][3] = agreement.InputAgreementProductList();
                        break;
                    }
                    case (2): {
                        st[j][0] = "Акт";
                        Act act = new Act();
                        st[j][1] = act.NumbertoString(act.InputActNumber());
                        st[j][2] = act.InputActDate();
                        st[j][3] = act.InputActProductList();
                        break;
                    }
                    default: {
                        System.out.println("Введен некорректный тип документа!!! Требуется повторный ввод");
                        j--;
                    }
                }
            }
            int printelement = 1;
            while (printelement!=0) {
                System.out.printf("Введите номер документа, который хотите распечатать. Всего документов - %s. " +
                        "Для завершения введите 0. \n", i);
                printelement = sc.nextInt();
                if (/*(printelement != 0)&*/(printelement>0)&(printelement<i+1)) {
                    System.out.printf(toString(st, printelement));
                    System.out.println();
                }
                else
                    if (printelement!=0) {
                        System.out.println("Введенный номер документа не существует!");
                    }
            }
        }
        else {
            System.out.println("Введено неверное количество элементов! Программа завершила свою работу.");
        }
    }

    private static String toString(String[][] mass, int num) {
        return "Элемент № "+num+": "
                +mass[num-1][0]+" с номером "
                +mass[num-1][1]+", дата "
                +mass[num-1][2]+", перечень продуктов - "
                +mass[num-1][3]+".";
    }
}
