public class palindromStrign {

	public static boolean palindrom(String kelime) {
		int i=0;
		int j=kelime.length()-1;
		while(i<j) {
			if(kelime.charAt(i)!=kelime.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		System.out.println(palindrom("baba"));
		System.out.println(palindrom("aba"));	
	}
}