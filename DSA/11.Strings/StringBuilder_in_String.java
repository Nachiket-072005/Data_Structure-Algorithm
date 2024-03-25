public class StringBuilder_in_String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        //Time Complexity - O(n)
        for(char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}