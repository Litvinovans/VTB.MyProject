package Lesson18.Lection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Введите выражении, используя скобки вида: “(”, “)”, “{”, “}”, “[”, “]”");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("Результат проверки введенного выражения - "+checkString(str));
    }

    static boolean checkString(String str) {
		Stack myst = new Stack();
		int count = 0;

		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
			{
				myst.Push(str.charAt(i));
				count++;
			}
			else {
				if (!myst.StkIsEmpty()) {
					myst.Pop();
					count--;
				}
				else {
					count=count-2;
				}
			}
		}
		if (count==0)
			return true;
		else
			return false;
	}
}
