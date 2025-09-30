import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    private static int x, arrSize, arrEl, pos;
    private static int[] arr = null;
    public static void main(String[] args) {
        String xString;

        System.out.println("Введите номер задания (от 1 до 5): ");
        Scanner sc = new Scanner(System.in);
        int taskNum = sc.nextInt();

        switch (taskNum) {
            case 1:
                arr = createArray();
                try {
                    System.out.println("Введите искомое число: ");
                    x = sc.nextInt();
                    System.out.println("Индекс искомого числа: " + findLast(arr, x));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 2:
                arr = createArray();
                try {
                    System.out.println("Введите число: ");
                    x = sc.nextInt();
                    System.out.println("Введите место числа в массиве: ");
                    pos = sc.nextInt();
                    System.out.print("Новый массив: ");
                    printArray(add(arr, x, pos));
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено не число.");
                }
                break;
            case 3:
                arr = createArray();
                System.out.println("Массив в обратном порядке: ");
                reverse(arr);
                break;
            case 4:
                System.out.println("Введите 2 массива по очереди: ");
                int[] arr1 = createArray();
                int[] arr2 = createArray();
                System.out.println("Массивы, соединённые в один массив: ");
                printArray(concat(arr1, arr2));
                break;
            case 5:
                arr = createArray();
                int[] newArr = deleteNegative(arr);
                System.out.println("Массив без отрицательных элементов: ");
                printArray(newArr);
                break;
        }
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");

        try {
            arrSize = sc.nextInt();
            arr = new int[arrSize];

            System.out.println("Вводите элементы массива через Enter: ");
            for (int i = 0; i < arrSize; i++) {
                arrEl = sc.nextInt();
                arr[i] = arrEl;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число.");
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
    }

    public static int findLast(int[] arr, int x) {
        int iFound = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                iFound = i;
            }
        }

        return iFound;
    }

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

    public static void reverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

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
}
