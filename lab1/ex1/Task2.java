public class Task2 {
    public void main(String[] args) {
        // int x = 8;
        // int y = 0;
        // System.out.println(safeDiv(x, y));


    }

    public double safeDiv(int x, int y) {
        try {
            return x / y;
        } catch (Exception ArithmeticException) {
            return 0;
        }
    }

    public String makeDecision(int x, int y) {
        return "test";
    }
}
