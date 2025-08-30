public class String_Split_Method {
    public static void main(String[] args) {
        String s = "Hello, Welcome to the world of Coding.   ";

        String regex = "[,\\s\\.]";

        String str[] = s.split(regex);

        for (String s1 : str) {
            System.out.println(s1);
        }
    }
}
