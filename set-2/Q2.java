public class Q2{
	public static void main(String[] args){
		int n = 5;
		int[] arr = {2,1,3,2,6,4};
		int mx = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] > mx)
				mx = arr[i];
		}
		
		System.out.println("\nlargest number: " + mx);
	}
}