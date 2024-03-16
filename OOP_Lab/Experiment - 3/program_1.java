public class program_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No student names provided.");
            return;
        }

        System.out.printf("No. of arguments  = %d:\n", args.length);

        for (int i = 0; i < args.length; i++) {
            String ordinal = getOrdinal(i + 1);
            System.out.printf("%s student name: %s\n", ordinal, args[i]);
        }
    }

    static String getOrdinal(int number) {
        if (number >= 10 && number <= 20) {
            return number + "th";
        }

        switch (number % 10) {
            case 1:
                return number + "st";
            case 2:
                return number + "nd";
            case 3:
                return number + "rd";
            default:
                return number + "th";
        }
    }
}