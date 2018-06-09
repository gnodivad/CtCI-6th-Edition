class CheckPermutation01 {
    public static boolean permutation(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] charCountForWord1 = new int[26];
        int[] charCountForWord2 = new int[26];

        for(int i = 0; i < charCountForWord1.length; i++) {
            charCountForWord1[i] = 0;
            charCountForWord2[i] = 0;
        }

        for(int i = 0; i < word1.length(); i++) {
            int val1 = word1.charAt(i);
            int val2 = word2.charAt(i);

            charCountForWord1[val1 - "a".charAt(0)]++;
            charCountForWord2[val2 - "a".charAt(0)]++;
        }

        for(int i = 0; i < charCountForWord1.length; i++) {
            if (charCountForWord1[i] != charCountForWord2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};

		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
	    }
    }
}