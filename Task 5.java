import java.util.Scanner;

 class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        int height = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Error: Height and width must be at least 2.");
        } else {
            for (int i = 1; i <= width; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int row = 1; row <= height - 2; row++) {
                System.out.print("*");

                for (int space = 1; space <= width - 2; space++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }

            for (int i = 1; i <= width; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
