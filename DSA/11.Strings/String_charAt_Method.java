public class String_charAt_Method {

    public static void printChar(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String name = "Nachiket";
        printChar(name);
    }
}