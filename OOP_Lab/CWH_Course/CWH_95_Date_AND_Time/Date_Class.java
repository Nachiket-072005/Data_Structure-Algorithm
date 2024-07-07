import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
