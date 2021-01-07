package Lesson12.Task2;
//2) Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("Enter full path ('quit' to exit): ");
            s = sc.next();
            if(s.equals("quit"))
                break;
            File f = new File(s);
            if (!f.exists()) {
                System.out.println("\nNot found: " + s);
                continue;
            }
            if (!f.isDirectory()) {
                System.out.println("\nNot directory: " + s);
                continue;
            }
            list(s,0);
        }
    }

    static void list(String szDir, int num)
    {
        int i;
        File f = new File(szDir);
        String[] sDirList = f.list();
        for(i = 0; i < sDirList.length; i++)
        {
            File f1 = new File(szDir + File.separator + sDirList[i]);

            if(f1.isFile()) {
                for (int j = 0; j<num; j++)
                    System.out.print("  ");
                System.out.println(szDir + File.separator + sDirList[i]);
            }
            else
            {
                list(szDir + File.separator + sDirList[i], num+1);
            }
        }
    }
}