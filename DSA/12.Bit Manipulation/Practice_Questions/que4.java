public class que4 {
    public static void main(String[] args) {
        //Convert upperCase character to lowerCase
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' '));
        }
        System.out.println();
    }
}