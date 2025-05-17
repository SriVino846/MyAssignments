package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,3,2,8,6,7};
		
		Arrays.sort(arr);
				
		for(int i=0;i<arr.length;i++) {
			
			if(i+1 != arr[i]) {
				
				System.out.println("The missing number is"+ (i+1));
				break;
			}
		}

	}

}
