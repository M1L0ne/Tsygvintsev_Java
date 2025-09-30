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
        } catch (ArithmeticException e) {
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

# Задание 3
## Задача 1
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static String reverseListNums(int x) {
        String str = "";
        for (int i = x; i >= 0; i--) {
            str = str + i;
        }

        return str;
    }

## Задача 2
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }

        return result;
    }

## Задача 3
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static boolean equalNum(int x) {
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

## Задача 4
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

## Задача 5
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static void guessGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
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

# Задание 4
## Задача 1
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static int findLast(int[] arr, int x) {
        int iFound = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                iFound = i;
            }
        }

        return iFound;
    }

## Задача 2
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = x;
                continue;
            }
            newArr[i] = arr[j];
            j++;
        }
        return newArr;
    }

## Задача 3
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static void reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

## Задача 4
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i + arr1.length] = arr2[i];
        }

        return newArr;
    }

## Задача 5
### Текст задачи
Полный текст задачи
### Алгоритм решения
    public static int[] deleteNegative(int[] arr) {
        int newArrLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArrLength++;
            }
        }

        int[] newArr = new int[newArrLength];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }