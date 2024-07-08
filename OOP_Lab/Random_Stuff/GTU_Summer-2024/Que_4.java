public class Que_4 {
    public static void main(String[] args) {
        int x = 3, y = 3;
        switch (x + 3) {
            case 6:
                y = 1;   
            default:
                y += 1;
        }
        System.out.println("y is:" + y);
    }
}
