public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.err.print("1 ");
                } else {
                    System.err.print("0 ");
                }
            }
            System.err.println();
        }
    }
}