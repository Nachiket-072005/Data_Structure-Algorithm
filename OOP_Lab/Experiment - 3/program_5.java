class time {
    private byte hour;
    private byte minute;

    void initialize(byte hour, byte minute) {
        this.hour = hour;
        this.minute = minute;
    }

    time sum(time t) {
        int h = this.hour + t.hour;
        int m = this.minute + t.minute;
        time t1 = new time();
        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }

        t1.initialize((byte) h, (byte) m);
        return t1;
    }

    void printTime() {
        System.out.printf("%s : %s\n", this.hour, this.minute);
    }
}

public class program_5 {
    public static void main(String[] args) {
        time t1 = new time();
        t1.initialize((byte) 21, (byte) 45);
        t1.printTime();
        time t2 = new time();
        t2.initialize((byte) 2, (byte) 56);
        t1 = t1.sum(t2);
        t1.printTime();

    }
}