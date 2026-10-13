package task3;
import java.util.Scanner;
class task3{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 12 :");
        int n = Scanner.nextInt();

        int result = 1;

        for (int i = 1; i<=n ; i++){

            result = result * i;
            System.out.println(n + "! =" + result);
            Scanner.close();
        }

    }

}
