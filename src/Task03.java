import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int jn = scanner.nextInt();
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < jn; j++) {
                if (i == 0 | j == 0 | j == jn - 1 | i == in - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
