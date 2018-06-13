class Urlify01 {
    public static char[] replaceSpaces(char[] arr, int trueLength) {
        int spaceCount = 0;

        for (int i = 0; i < trueLength; i++) {
            if (arr[i] == ' ') {
                spaceCount++;
            }
        }

        char[] string = new char[trueLength + (spaceCount * 3)];

        for (int i = 0, j = 0; i < trueLength; i++) {
            if (arr[i] == ' ') {
                string[j++] = '%'; 
                string[j++] = '2'; 
                string[j++] = '0';
            } else {
                string[j++] = arr[i];
            }
        }

        return string;
    }

    public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		char[] newArr = replaceSpaces(arr, trueLength);	
		System.out.println("\"" + charArrayToString(newArr) + "\"");

    }

    public static String charArrayToString(char[] array) {
		StringBuilder buffer = new StringBuilder(array.length);
		for (char c : array) {
			if (c == 0) {
				break;
			}
			buffer.append(c);
		}
		return buffer.toString();
	}
}