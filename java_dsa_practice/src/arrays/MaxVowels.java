package arrays;

public class MaxVowels {
	static boolean isVowel(char c) {
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}
 static int  maxvowels(String s,int k) {
	
	 int count=0;
	 for(int i=0;i<k;i++) {
		 if(isVowel(s.charAt(i))) {
			 count++;
		 }
	 }
		 int max= count;
		 for(int i=k;i<s.length();i++) {
			 if(isVowel(s.charAt(i))) 
				 count++;
			 if(isVowel(s.charAt(i-k)))
				 count--;
			 max = Math.max(max,count);
		 }
		 return max;
	 }
 public static void main(String args[]) {

     String s="abciiidef";

     System.out.println(maxvowels(s,3));
 }
 }

