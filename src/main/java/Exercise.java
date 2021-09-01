public class Exercise {
    public static void main(String[] args) {
        isMonth(3);
    }

    public static void isMonth(int n) {
        boolean isMonth = false;

        if (n > 0 && n <= 12) {
            isMonth = true;
        }

        if (isMonth == true) {
            if (n == 2) {
                System.out.println("Tháng " + n + " có 28 ngày.");

            } else if (n == 4 || n == 6 || n == 9 || n == 11) {
                System.out.println("Tháng " + n + " có 30 ngày.");

            } else System.out.println("Tháng " + n + " có 31 ngày.");
        }
    }
}
