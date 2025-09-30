# Цыгвинцев Олег ИТ-3 Лабораторная №1

# Задание 1
## Задача 1
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static int sumLastNums(int x) {
    if (x / 10 != 0) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;

        int y = lastDigit + secondLastDigit;
        return y;
    }

    return x;
}

## Задача 2
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static boolean isPositive(int x) {
    if (x > 0) {
        return true;
    }

    return false;
}

## Задача 3
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static boolean isUpperCase(char x) {
    if (x >= 'A' && x <= 'Z') {
        return true;
    }

    return false;
}

## Задача 4
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static boolean isDivisor(int a, int b) {
    if (b % a == 0 || a % b == 0) {
        return true;
    }

    return false;
}

## Задача 5
### Текст задачи
Полный текст задачи
### Алгоритм решения
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

# Задание 2
## Задача 1
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static double safeDiv(int x, int y) {
    try {
        return x / y;
    } catch (Exception ArithmeticException) {
        return 0;
    }
}

## Задача 2
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static String makeDecision(int x, int y) {
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

## Задача 3
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static boolean sum3(int x, int y, int z) {
    if (x + y == z || x + z == y || y + z == x) {
        return true;
    }

    return false;
}

## Задача 4
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static String age(int x) {
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

## Задача 5
### Текст задачи
Полный текст задачи
### Алгоритм решения
public static void printDays(String x) {
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