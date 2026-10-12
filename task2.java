package task2;
import java.util.Scanner;
class task2{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter A positive number  :");
        int n = Scanner.nextInt();

        int count = 0;
        System.out.print("Even numbers are : ");
        for (int i = 2; i <= n ; i ++){
            if (i % 2 == 0){
                System.out.print(i + " ");
                count ++;

            }
        }
          System.out.println();
        System.out.println( "count : " + count);
        Scanner.close();
    }
}
