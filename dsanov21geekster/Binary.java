package dsanov21geekster;


public class Binary {
	

		
		public static void main(String[]args){
				int a [] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
				int target = 6;
				freq (a,target);
		}
		static void freq(int a[],int target) {
			int count = 0;
			for(int i=0;i<a.length;i++) {
				if(target==a[i]) {
					count++;
				
			}
		}
			System.out.println(count);
			

	}


}
