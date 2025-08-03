public class String_Que_4 {
    public static void reverse(String[] w) {
        int i = 0;
        int j = w.length - 1;

        while (i < j) {
            String temp = w[i];
            w[i] = w[j];
            w[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        String s = "abc def ghi efg";

        int l = s.length();
        String currWord = "";
        int count = 0;

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        count = count + 1;
        String words[] = new String[count];
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
