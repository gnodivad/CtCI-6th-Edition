class OneAway {
    public static boolean isOneAway(String first, String second) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        // s2 will always is the longest string
        String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;

		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {

                // If encounter difference in second time, return false
				if (foundDifference) return false;

				foundDifference = true;
				if (s1.length() == s2.length()) {
					index1++;
				}
			} else {
				index1++;
			}
			index2++;
		}

		return true;
    }

    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bake"));
    }
}