import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
