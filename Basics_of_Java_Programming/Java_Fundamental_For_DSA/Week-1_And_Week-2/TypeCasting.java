public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt); // 9
        System.out.println(myDouble); // 9.0

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2); // 9.78
        System.out.println(myInt2); // 9
    }
}
