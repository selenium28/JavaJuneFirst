package basic;

public class StringConcatination {

	public static void main(String[] args) {
		// + : Operator
		
		int a = 100;
		int b = 200;
		String s1 = "Java";
		String s2 = "Selenium";
		
		System.out.println(a+b);    // 300
		System.out.println(s1+s2);  // JavaSelenium
		System.out.println(b+s2);   // 200Selenium
		System.out.println(b+a+s2); // 300Selenium
		System.out.println(b+a+s1+a+s2+a+b); // 300Java100Selenium100200

	}

}
