package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1= "stops";
		String text2= "potss";
		
		if(text1.length() == text2.length()) {
			
			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			System.out.println(char1);
			System.out.println(char2);
			
			if(Arrays.equals(char1, char2)) {
				System.out.println("Its an anagram");
			}
			else {
				System.out.println("Its not an anagram");
			}
		}
		
		else {
			System.out.println("It is not an Anagram");
		}

	}

}
