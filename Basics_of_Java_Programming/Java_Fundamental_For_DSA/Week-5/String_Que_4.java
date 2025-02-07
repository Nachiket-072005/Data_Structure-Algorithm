public class String_Que_4 {
    public static void reverse(String s[]) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "abc def ghi jkl";
        int l = s.length();
        int count = 0;

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        String words[] = new String[count + 1];
        String currWord = "";
        int index = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ') {
                currWord = currWord + s.charAt(i);
            } else {
                words[index] = currWord;
                currWord = "";
                index++;
            }
        }

        words[index] = currWord;
        reverse(words);

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
