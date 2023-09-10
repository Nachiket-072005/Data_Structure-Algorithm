package Operators;
import javax.swing.plaf.synth.SynthEditorPaneUI;

public class JavaBasic014 {
    public static void main(String args[]) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
