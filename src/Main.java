import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    //    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    //    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    //    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void task1() {
        System.out.println("Первое задание");
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            try {
                System.out.println("Введите дробное число");
                String str = scanner.nextLine().replace(",", ".");
                double d = Double.parseDouble(str);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Ошибка!");
                continue;
            }
            run = false;
        }

    }


    //    Если необходимо, исправьте данный код
    //    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task2() {
        int[] intArray = null;
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }

    }

    //    Дан следующий код, исправьте его там, где требуется
    //    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    //    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    //    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите что-нибудь, кроме пустой строки");
            String s = scanner.nextLine();
            if (s.isEmpty())
                throw new Exception("Пустые строки вводить нельзя.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}