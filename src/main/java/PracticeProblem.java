import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {}

	public static ArrayList<String> perms(String str) {

		ArrayList<String> permu = new ArrayList<String>();
		permsHelper("", str, permu);
		return permu;
	}

	public static void permsHelper(String usedLetters, String unusedLetters, ArrayList<String> permu) {
		
		String UL = usedLetters;
		String UUL = "";

		if (unusedLetters.equals("")) {
			permu.add(UL);
			return;
		}

		for (int i=0; i<unusedLetters.length(); i++) {
			UL = usedLetters + unusedLetters.charAt(i);
			UUL = (unusedLetters.substring(0, (i)))+(unusedLetters.substring((i+1)));
			permsHelper(UL, UUL, permu);
		}
	}

	public static ArrayList<String> permsUnique(String str) {

		ArrayList<String> permu = new ArrayList<String>();
		permsHelper2("", str, permu);
		return permu;
	}

	public static void permsHelper2(String usedLetters, String unusedLetters, ArrayList<String> permu) {
		
		String UL = usedLetters;
		String UUL = "";

		if (unusedLetters.equals("")) {
			if (!permu.contains(usedLetters)) {
				permu.add(UL);
				return;
			}
		}

		for (int i=0; i<unusedLetters.length(); i++) {
			UL = usedLetters + unusedLetters.charAt(i);
			UUL = (unusedLetters.substring(0, (i)))+(unusedLetters.substring((i+1)));
			permsHelper2(UL, UUL, permu);
		}
	}
}