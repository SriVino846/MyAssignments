package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";

		String[] word1 = text.split(" ");
		int count=0;

		for (int i = 0; i < word1.length; i++) {
			count =+ 1;

			if (word1[i].equals(" ")) {
				continue;
			}

			for (int j = i+1; j < word1.length; j++) {
				if (word1[i].equalsIgnoreCase(word1[j])) {
					word1[j] = " "; 
					count++;
				}
			}

			if (count > 1) {
				System.out.println("Duplicate found: " + word1[i]);
			}
		}	
		String b = String.join(" ", word1); 
		System.out.println("Modified text: " + b);
	}

}
