import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int jn = scanner.nextInt();
        for (int i = in; i < jn + 1; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i*j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
