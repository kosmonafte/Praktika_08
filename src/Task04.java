import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int jn = scanner.nextInt();
        for (int i = in; i < jn; i++) {
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
