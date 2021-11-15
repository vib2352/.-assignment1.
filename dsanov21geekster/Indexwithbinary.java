package dsanov21geekster;

public class Indexwithbinary {
	static int binary_search(int[]nums,int target) {
		int low=0,high= nums.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if (target<nums[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
		
		
	}
	public static void main(String[]args) {
		int nums[] = {1,2,3,4,5,6,7,8,9};
		int target=6;
		System.out.println(binary_search(nums,target));
		
	}

}
