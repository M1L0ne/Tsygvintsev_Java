import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public void main(String[] args) {
        String xString;
        int a, b, x, y, z;
        System.out.println("Введите номер задания (от 1 до 5): ");
        Scanner sc = new Scanner(System.in);
        int taskNum = sc.nextInt();

        switch(taskNum) {
            case 1:
                System.out.println("Введите 2 числа через Enter: ");
                try {
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Деление x на y: " + safeDiv(x, y));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 2:
                System.out.println("Введите 2 числа через Enter: ");
                try {
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Числа со знаком сравнения: " + makeDecision(x, y));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 3:
                System.out.println("Введите 3 числа через Enter: ");
                try {
                    x = sc.nextInt();
                    y = sc.nextInt();
                    z = sc.nextInt();
                    System.out.println("Из двух чисел можно получить третье? " + sum3(x, y, z));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 4:
                System.out.println("Введите число: ");
                try {
                    x = sc.nextInt();
                    System.out.println("Число в годах: " + age(x));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 5:
                System.out.println("Введите день недели: ");
                xString = sc.next();
                printDays(xString);
                break;
        }
    }

    public double safeDiv(int x, int y) {
        try {
            return x / y;
        } catch (Exception ArithmeticException) {
            return 0;
        }
    }

    public String makeDecision(int x, int y) {
        if (x > y) {
            return (x + " > " + y);
        }
        else if (x < y) {
            return (x + " < " + y);
        }
        else {
            return (x + " == " + y);
        }
    }

    public boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        }

        return false;
    }

    public String age(int x) {
        int divX = x % 10;
        if (divX == 1) {
            return (x + " год");
        }
        else if ((divX >= 2 && divX <= 4) && (x < 12 || x > 14)) {
            return (x + " года");
        }
        else {
            return (x + " лет");
        }
    }

    public void printDays(String x) {
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        switch (x) {
            case "понедельник":
                for (int i = 0; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "вторник":
                for (int i = 1; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "среда":
                for (int i = 2; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "четверг":
                for (int i = 3; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "пятница":
                for (int i = 4; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "суббота":
                for (int i = 5; i < days.length; i++) {
                    System.out.println(days[i]);
                }
                break;
            case "воскресенье":
                System.out.println(days[6]);
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}
