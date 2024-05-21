public class count_Set_Bit {
    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            // To check our LSB
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(10));
    }
}