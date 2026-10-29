import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = input.nextInt();

        int i = 2;
        while (i <= n) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
