package Lesson12.Task1;

import java.io.*;
import java.util.Scanner;

//1) Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // создание файла
        File mf = new File("notes.txt");
        try{
            boolean bb = mf.createNewFile();
            if (bb)
                System.out.println("Файл создан");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Проверьте создание файла с именем %s\n",mf.getName());
        System.out.println("Введите 1 для продолжения.");
        int i = sc.nextInt();
        // переименование файла
        File newFile = new File("notes1.txt");
        if(mf.renameTo(newFile)){
            System.out.println("Файл переименован успешно");;
        }else{
            System.out.println("Файл не был переименован");
        }
        System.out.printf("Проверьте переименование файла с именем %s в %s \n",mf.getName(),newFile.getName());
        System.out.println("Введите 1 для продолжения.");
        i = sc.nextInt();
        // копирование файла
            // создаем файл, который будем копировать "notes10.txt"
            String s = "Hello World!";
            try {
              FileOutputStream fos = new FileOutputStream("notes10.txt");
              byte[] buffer = s.getBytes("KOI8");
              fos.write(buffer, 0, buffer.length);
              fos.flush();
              fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            // копируем файл "notes10.txt" в "notes11.txt"
            try {
                FileInputStream fis = new FileInputStream("notes10.txt");
                FileOutputStream fos = new FileOutputStream("notes11.txt");
                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, length);
                }
                fos.flush();
                fos.close();
                fis.close();
                System.out.println("Файл успешно скопирован!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        // удаление файла
        if(newFile.delete()){
            System.out.printf("Файл %s удален",newFile.getName());;
        }else{
            System.out.println("Файл не был удален");
        }
    }
}
