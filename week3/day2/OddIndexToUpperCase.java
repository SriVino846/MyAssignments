package week3.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="changeme";
		char[] value = test.toCharArray();
		System.out.println(value);
		for(int i=0;i<value.length;i++)
		{
			if(i%2!=0) {
				value[i] = Character.toUpperCase(value[i]);
			}
		}

		System.out.println(value);
	}

}
