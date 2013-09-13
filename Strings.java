public class Strings {

	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

		// if (str.equals(s)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		// for (int i = 0; i < str.length(); i++) {
		// 	System.out.println(str.charAt(i));
		// }

		for (int i = 0; i<str.length()-1; i++) {

			System.out.println(str.substring(i, i+2));
		}
		if (contains("baseball", "ball")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		count("people", "e");

	}
	public static int count(String s, String t) {
		for (int i=0; i<s.length()-t.length()+1; i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				sum +=1;
			}
		}

	}

	public static hasAnA(String s) {
		
		for (int i=0; i<s.length(); i++) {
			
		}
		System.out.println(str.charAt(a));
}
	
	public static isAbecedarian(String s, String t) {
		char a = 0;
		for (int i=0; i<; i++) {
			if (chartAt(String s) {
				
			}
				
		}
	}

	public static boolean contains(String s, String t) {
		for (int i=0; i < s.length()-t.length()+1; i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				return true;
			}
		}
		return false;
	}

}