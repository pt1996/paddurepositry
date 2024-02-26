package newprograms;

public class ReplaceStr {

	public static void main(String[] args) {
		String value="puttaparthi";
		System.out.println(value.replaceAll("p","P"));
		System.out.println(value.repeat(2));
		System.out.println(value.substring(1));
		System.out.println(value.substring(5,11));
		String value1="I Love My Country";
		System.out.println(value1.replaceAll(" ",""));
		System.out.println("let's take alphanumeric value and remove alphabets in it");
		String e="pa12dd3i";
		System.out.println(e.replaceAll("[a-z]",""));
		System.out.println(value1.replaceAll("Love", ""));

	}

}
