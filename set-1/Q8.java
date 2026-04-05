import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter a number: ");

		int n = helper.nextInt();
		int fact = 1;

		while(n > 1){
			fact *= n;
			n--;
		}

		System.out.println("factorial : " + fact);
	}
}
