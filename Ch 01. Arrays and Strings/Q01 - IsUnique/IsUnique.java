class isUnique {
    public static boolean isUniqueChars(String word) {
        if (word.length() > 128) {
            return false;
        }

        boolean[] isUnique = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);

            if (isUnique[val]) return false;

            isUnique[val] = true;
        }

        return true;
    }

    public static void main(String args[]) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};

		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}    
    }
}