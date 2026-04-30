public class Q6 {
    public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int target = 4;
		int lo = 0;
		int hi = arr.length - 1;
		boolean found = false;
	
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			int val = arr[mid];

			if(val < target){
				lo = mid + 1;		
			}

			if(val > target) {
				hi = mid - 1;
			}

			if(val == target){
				found = true;
				break;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
            System.out.print(arr[i] + " ");
		}
		 System.out.println();
		System.out.println(found ? "element 4 found in the array" : "element not found");
	}
}
