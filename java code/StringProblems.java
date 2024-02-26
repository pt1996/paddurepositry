package stringclass;

public class StringProblems {

	public static void main(String[] args) {
		String k="padmini";
		System.out.println(k.toLowerCase());
		System.out.println(k.toUpperCase());
		String z="         india is my county   ";
		System.out.println(z.trim());
		String s1="padmini";
		String s2="kishore";
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.contains("d"));
		System.out.println(s1.substring(2));
		System.out.println(s1.matches("pa"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.replaceAll("n","i"));

	}

}
