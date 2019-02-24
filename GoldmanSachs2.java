/* Problem Name is &&& Dist. Between Strings &&& PLEASE DO NOT REMOVE THIS LINE. */


public class Solution {

	public static double shortestDistance(String document, String word1, String word2) {
		if (word1 == null || word2 == null || document == null || word1.replaceAll("[^a-zA-Z]", "").trim().equals("") || word2.replaceAll("[^a-zA-Z]", "").trim().equals(""))
			return -1;
		
		String[] words = document.split(" ");

		int index = 0;
		double shortest = document.length();
		double word1Loc = 0;
		double word2Loc = 0;
		for(String word : words) {
			int pun = word.length();
			word = word.replaceAll("[^a-zA-Z]", ""); 
			pun -= word.length();
			if(word.equalsIgnoreCase(word1)) {
				word1Loc = index + (word.length()/2.0);
			} else if(word.equalsIgnoreCase(word2)) {
				word2Loc = index + (word.length()/2.0);
			}

			if(word1Loc > 0 && word2Loc > 0) {
				double current = Math.abs(word2Loc - word1Loc);
				if(current < shortest) {
					shortest = current;
				}
			}

			index += word.length()+1+pun;
		}

		if(word1Loc == 0 || word2Loc == 0) {
			return -1;
		}

		return shortest;
	}

	/**
	 * Returns true if the tests pass. Otherwise, false.
	 */
	public static boolean doTestsPass() {
		// todo: implement more tests if you'd like
		return  shortestDistance(_document, "and", "graphic") == 6d &&
				shortestDistance(_document, "transfer", "it") == 14d &&
				shortestDistance(_document, "layout", "It" ) == 6d &&
				shortestDistance(_document, "Design", "filler" ) == 25d &&
				shortestDistance(_document, "It", "transfer") == 14d &&
				Math.abs(shortestDistance(_document, "of", "lorem") - 4.5) < 0.000001 &&
				shortestDistance(_document, "thiswordisnotthere", "lorem") == -1d &&
				shortestDistance(_document, "and", null) == -1d &&
				shortestDistance(_document, "and", ".") == -1d &&
				shortestDistance(_document, "and", "") == -1d
			;
	}

	/**
	 * Execution entry point.
	 */
	public static void main(String[] args) {
		// Run the tests
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}
	}

	private static final String _document;
	static{
		StringBuffer sb = new StringBuffer();
		sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
		sb.append(" of a document or visual presentation. Replacing meaningful content that could be distracting with placeholder text");
		sb.append(" may allow viewers to focus on graphic aspects such as font, typography, and page layout. It also reduces the need");
		sb.append(" for the designer to come up with meaningful text, as they can instead use hastily generated lorem ipsum text. The");
		sb.append(" lorem ipsum text is typically a scrambled section of De finibus bonorum et malorum, a 1st-century BC Latin text by");
		sb.append(" Cicero, with words altered, added, and removed to make it nonsensical, improper Latin. A variation of the ordinary");
		sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
		sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");
		sb.append(" employed it in graphics and word processing templates for its desktop publishing program, PageMaker, for the Apple");
		sb.append(" Macintosh. A common form of lorem ipsum reads: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do");
		sb.append(" eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation");
		sb.append(" ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit");
		sb.append(" esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui");
		sb.append(" officia deserunt mollit anim id est laborum.");

		_document = sb.toString();
	}
}