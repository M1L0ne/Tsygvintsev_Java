public class Task1 {
    public void main(String[] args) {       
        //int x = 4568;
        // System.out.println(sumLastNums(x));

        // int x = 3;
        // System.out.println(isPositive(x));

        // char x = 'A';
        // System.out.println(isUpperCase(x));

        // int a = 6;
        // int b = 3;
        // System.out.println(isDivisor(a, b));

        int a = 5;
        int b = 11;
        a = lastNumSum(a, b);
        b = 123;
        a = lastNumSum(a, b);
        b = 14;
        a = lastNumSum(a, b);
        b = 1;
        a = lastNumSum(a, b);
        System.out.println("Итого " + a);
    }

    public int sumLastNums(int x) {
        if (x / 100 != 0) {
            int lastDigit = x % 10;
            int secondLastDigit = lastDigit % 10;

            int y = lastDigit + secondLastDigit;
            return y;
        }

        return 0;
    };   

    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        }

        return false;
    }

    public boolean isUpperCase(char x) {
        if (x >= 'A' && x <= 'Z') {
            return true;
        }

        return false;
    }

    public boolean isDivisor(int a, int b) {
        if (b % a == 0 || a % b == 0) {
            return true;
        }

        return false;
    }

    public int lastNumSum(int a, int b) {
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