package stringclass;

public class Assignment74 {

	public static void main(String[] args) {
		String result="GroTechMinds";
		System.out.println("Capital Letters:" + result.replaceAll("[a-z]", ""));
		System.out.println("Smaller Letters:" +result.replaceAll("[A-Z]", ""));
		
	}

}
