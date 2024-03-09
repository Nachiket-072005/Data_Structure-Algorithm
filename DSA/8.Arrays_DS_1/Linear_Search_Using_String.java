import java.lang.String;
public class Linear_Search_Using_String {
    public static int Linear_Search(String menu[], String key) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        String menu[] = {"dosa", "chole bhature", "samosa", "dabeli", "vadapav"};
        String key = "samosa";

        int idx = Linear_Search(menu, key);
        if(idx == -1) {
            System.out.println("NOT FOUND");
        }
        else {
            System.out.println("Key is at idx : " + idx);
        }
    }
}
