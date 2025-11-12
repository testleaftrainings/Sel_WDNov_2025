package week2.day3;

public class LearnAdvanceStringMethods {

	public static void main(String[] args) {

		String sentenceOne ="Testleaf is your no.1 Automation partner";
		String[] split = sentenceOne.split("e");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("**********");
		String replace = sentenceOne.replace("e", "@");
		System.out.println(replace);
		System.out.println("**********");
		String replaceAll = sentenceOne.replaceAll("\\s", "_");
		System.out.println(replaceAll);
		System.out.println("**********");
		// start index - 9  ending index - 16
		String substring = sentenceOne.substring(9, 16);
		System.out.println(substring);

	}

}
