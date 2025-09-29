import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        char xChar;
        int a, b, x;
        System.out.println("Введите номер задания (от 1 до 5): ");
        Scanner sc = new Scanner(System.in);
        int taskNum = sc.nextInt();

        switch(taskNum){
            case 1:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    System.out.println("Сумма его последних цифр: " + sumLastNums(x));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 2:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    System.out.println("Число положительное? " + isPositive(x));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 3:
                System.out.println("Введите букву: ");
                try {
                    xChar = sc.nextLine().charAt(0);
                    System.out.println(isUpperCase(xChar));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введена не буква.");
                }
                break;
            case 4:
                System.out.println("Введите 2 числа через Enter: ");
                try {
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Любое из принятых чисел делит другое нацело? " + isDivisor(a, b));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 5:
                System.out.println("Вводите числа через Enter. Для завершения введите '0' после первого числа: ");
                try {
                    a = sc.nextInt();
                    do {
                        b = sc.nextInt();
                        a = lastNumSum(a, b);
                    } while (b != 0);

                    System.out.println("Итого " + a);
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
        }
    }

    public static int sumLastNums(int x) {
        if (x / 10 != 0) {
            int lastDigit = x % 10;
            int secondLastDigit = (x / 10) % 10;

            int y = lastDigit + secondLastDigit;
            return y;
        }

        return x;
    };   

    public static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }

        return false;
    }

    public static boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        }

        return false;
    }

    public static boolean isDivisor(int a, int b) {
        if (b % a == 0 || a % b == 0) {
            return true;
        }

        return false;
    }

    public static int lastNumSum(int a, int b) {
        if (a / 10 != 0) {
            a = a % 10;
        }

        if (b / 10 != 0)
        {
            b = b % 10;
        }

        a = a + b;

        return a;
    }
}