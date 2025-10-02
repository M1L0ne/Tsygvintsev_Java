# Цыгвинцев Олег ИТ-3 Лабораторная №1

# Задание 1
## Задача 1
### Текст задачи
Сумма знаков.
Дана сигнатура метода: public int sumLastNums (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал результат
сложения двух последних знаков числах, предполагая, что знаков в числе не
менее двух.
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
Есть ли позитив.
Дана сигнатура метода: public bool isPositive (int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и
возвращал true, если оно положительное.
### Алгоритм решения
    public static boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }

        return false;
    }

## Задача 3
### Текст задачи
Большая буква.
Дана сигнатура метода: public bool isUpperCase (char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и
возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.
### Алгоритм решения
    public static boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        }

        return false;
    }

## Задача 4
### Текст задачи
Делитель.
Дана сигнатура метода: public bool isDivisor (int a, int b);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
любое из принятых чисел делит другое нацело.
### Алгоритм решения
    public static boolean isDivisor(int a, int b) {
        if (b % a == 0 || a % b == 0) {
            return true;
        }

        return false;
    }

## Задача 5
### Текст задачи
Многократный вызов.
Дана сигнатура метода: public int lastNumSum(int a, int b)
Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
двух чисел из разряда единиц. Выполните с его помощью последовательное
сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
задачу, используя минимально возможное количество вспомогательных
переменных.
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
Безопасное деление.
Дана сигнатура метода: public double safeDiv (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал деление x
на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При
делении на 0 следует вернуть из метода число 0. Подсказка: смотри
ограничения на операции типов данных.
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
Строка сравнения.
Дана сигнатура метода: public String makeDecision (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
которая включает два принятых методом числа и корректно выставленный
знак операции сравнения (больше, меньше, или равно).
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
Тройная сумма.
Дана сигнатура метода: public bool sum3 (int x, int y, int z);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
два любых числа (из трех принятых) можно сложить так, чтобы получить
третье.
### Алгоритм решения
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        }

        return false;
    }

## Задача 4
### Текст задачи
Возраст.
Дана сигнатура метода: public String age (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
которой сначала будет число х, а затем одно из слов:
год
года
лет
Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
12, 13, 14.
Слово “лет”добавляется во всех остальных случаях.
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
Вывод дней недели.
Дана сигнатура метода: public void printDays (String x);
В качестве параметра метод принимает строку, в которой записано название
дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
на экран название переданного в него дня и всех последующих до конца недели
дней. Если в качестве строки передан не день, то выводится текст “это не день
недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
задаче используйте switch.
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
Числа наоборот.
Дана сигнатура метода: public String reverseListNums (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
которой будут записаны все числа от x до 0 (включительно).
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
Степень числа.
Дана сигнатура метода: public int pow (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал результат
возведения x в степень y.
Подсказка: для получения степени необходимо умножить единицу на число x, и
сделать это y раз, т.е. два в третьей степени это 1*2*2*2
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
Одинаковость.
Дана сигнатура метода: public bool equalNum (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
все знаки числа одинаковы, и false в ином случае.
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
Левый треугольник.
Дана сигнатура метода: public void leftTriangle (int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран
треугольник из символов ‘*’ у которого х символов в высоту, а количество
символов в ряду совпадает с номером строки.
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
Угадайка.
Дана сигнатура метода: public void guessGame()
Необходимо реализовать метод таким образом, чтобы он генерировал
случайное число от 0 до 9, далее считывал с консоли введенное пользователем
число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
запускается до тех пор, пока пользователь не угадает число. После этого
выведите на экран количество попыток, которое потребовалось пользователю,
чтобы угадать число.
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
Поиск последнего значения.
Дана сигнатура метода: public int findLast (int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы он возвращал индекс
последнего вхождения числа x в массив arr. Если число не входит в массив –
возвращается -1.
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
Добавление в массив.
Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, который будет содержать все элементы массива arr, однако в позицию
pos будет вставлено значение x.
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
Реверс.
Дана сигнатура метода: public void reverse (int[] arr);
Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
После проведенных изменений массив должен быть записан задом-наперед.
### Алгоритм решения
    public static void reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

## Задача 4
### Текст задачи
Объединение.
Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, в котором сначала идут элементы первого массива (arr1), а затем
второго (arr2).
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
Удалить негатив.
Дана сигнатура метода: public int[] deleteNegative (int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, в котором записаны все элементы массива arr кроме отрицательных.
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