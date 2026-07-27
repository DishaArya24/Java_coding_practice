package Strings;

public class reverse_words {
	
	public static void main(String[] args) {
		String str = "Disha gonna be a rich";
		String[] words =str.trim().split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			result.append(words[i]);
			if(i!=0) {
				result.append(" ");
			}
		}
		System.out.println(result.toString());
		
		
		
	}

}
