import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Task3 {
    Scanner sc = new Scanner(System.in);

    public void main(String[] args) {
        String xString;
        int a, b, x, y, z;
        System.out.println("Введите номер задания (от 1 до 5): ");
        int taskNum = sc.nextInt();

        switch(taskNum) {
            case 1:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    System.out.println("Цифры, начиная с " + x + " в обратном порядке: " + reverseListNums(x));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 2:
                System.out.println("Введите 2 числа через Enter: ");
                try {
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println(x + " в степени " + y + ": " + pow(x, y));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 3:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    System.out.println("Все знаки числа одинаковы? " + (equalNum(x)));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 4:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    leftTriangle(x);
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 5:
                guessGame();
                break;
        }
    }

    public String reverseListNums(int x) {
        String str = "";
        for (int i = x; i >= 0; i--) {
            str = str + i;
        }

        return str;
    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }

        return result;
    }

    public boolean equalNum(int x) {
        int lastNum = x % 10;
        while (x / 10 != 0) {
            x = x / 10;
            if (x % 10 == lastNum) {
                lastNum = x % 10;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void guessGame() {
        Random random = new Random();
        int count = 0, num;
        System.out.println("Введите число от 0 до 9:");
        int guessedNum =  random.nextInt(10);
        do {
            num = sc.nextInt();
            count++;
            System.out.println("Вы не угадали, введите число от 0 до 9:");
        } while (guessedNum != num);

        System.out.println("Вы угадали!");
        System.out.println("Вы отгадали число за " + count + " попытки");
    }
}
