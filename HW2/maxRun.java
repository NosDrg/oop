public class maxRun {

    public static int maxRun(String str) {
        int max = 0;
        int index = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                index++;
            }
            if (index > max) {
                max = index;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                index = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "syyyxewerrrr";
        System.out.print(maxRun(str));
    }
}
