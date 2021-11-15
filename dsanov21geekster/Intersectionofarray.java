package dsanov21geekster;

public class Intersectionofarray {
	public static void main(String[]args) {
	int nums1[] = {2,3,4,5,6,7,8,9};
	int nums2[] = {1,3,5,7,9};
	for(int i =0;i<nums1.length;i++) {
		for(int j=0;j<nums2.length;j++) {
			if(nums1[i]==nums2[j]) {
				System.out.println(nums1[i]+" ");
			}
		}
	}

}


}
