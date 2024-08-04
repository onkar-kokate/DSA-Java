public class Butterfly {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            } // spaces

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            } // spaces

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}