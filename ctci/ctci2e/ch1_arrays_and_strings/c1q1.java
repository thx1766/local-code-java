public class c1q1 {
	public static void main(String[] argv){
		System.out.println("testing question 1_1");
		System.out.println("Implement an algorithm to determine if a string has all unique characters.");
		System.out.println("What if you can not use additional data structures?");
	
	if(argv.length != 1)
		System.out.println("wrong number of arguments");
	else{
		boolean value = isUniqueChars2(argv[0]);
		if(value == true)
			System.out.println("All characters are unique");
		else if(value == false)
			System.out.println("All characters are not unique");
	}
	
	}

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for(int i = 0; i<str.length(); i++){
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}
	//Space complexity is O(n), where n is the length of the string
	//Time complexity is O(n)

	//we can reduce space complexity by using a bit vector
	//below code assumes that the string is only lowercase 'a' to 'z'
	//this allows use of a single int

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i=0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val )) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}

}
