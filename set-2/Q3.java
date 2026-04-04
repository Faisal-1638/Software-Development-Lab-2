public class Q3{
	public static void main(String[] args){
		int n = 5;
		int[] arr = {2,1,3,2,6,4};
		int min = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("\nsmallest number: " + min);
	}
}