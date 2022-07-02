package string;

public class StringClass {

	public static void main(String[] args) {
		
		String s1 = new String("Dev");   // 2-object will be created 
		String s2 = new String("Dev"); // 2-object will be created 
		
//		System.out.println(s1==s2);  // false
//		System.out.println(s1.equals(s2));  // true
		
		String str1 = "Pune";
		String str2 = "Pune";
		
//		System.out.println(str1==str2);  // true
//		System.out.println(str1.equals(str2));  // true
		
		String s3 = new String("Java");  //2-object will be created 
		String s4 = "Java";  //1-object will be created 

		System.out.println(s3==s4); 
	}

}
