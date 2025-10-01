public class BlowUp {
        public static String blowup(String str) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (Character.isDigit(ch)) {
                    int num = ch - '0';
                    if (i + 1 < str.length()) {
                        char nextChar = str.charAt(i + 1);
                        for (int j = 0; j < num; j++) {
                            result.append(nextChar);
                        }
                    }
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(blowup("a3tx2z"));
            System.out.println(blowup("ab"));
            System.out.println(blowup("2a3b"));
            System.out.println(blowup(""));
            System.out.println(blowup("abc3"));
        }
}
