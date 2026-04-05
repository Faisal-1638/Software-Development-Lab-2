import java.util.Scanner;
public class Q3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
         else
            System.out.println("Odd");

         scan.close();
    }
    
}
