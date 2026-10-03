public class Pattern {
    public static void main(String[] args) {
        int num = 1; // for right-side numbers

        for (int i = 1; i <= 4; i++) {

            // Left side numbers (1, 22, 333, 4444)
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Spaces between left and right parts
            for (int s = 1; s <= 28 - (i * 2); s++) {
                System.out.print(" ");
            }

            // Right side increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}

