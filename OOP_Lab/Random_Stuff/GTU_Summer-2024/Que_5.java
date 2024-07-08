public class Que_5 {
    public static void main(String[] args) {
        int[] numbers = new int[1];
        numbers[0] = 0;
        m(numbers);
        System.out.println("numbers[0]  is: " + numbers[0]);
    }

    public static void m(int[] y) {
        y[0] = 3;
    }
}