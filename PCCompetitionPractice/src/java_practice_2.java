// java_practice_2.java
import javax.swing.*;
 
public class java_practice_2 {
    
    public static void main(String[] args) {
        String s, sx;
        int x;
        s = JOptionPane.showInputDialog(null, "Enter a string", "String", JOptionPane.QUESTION_MESSAGE);
        if(s != null) {
            sx = JOptionPane.showInputDialog(null, "Enter an integer", "Integer", JOptionPane.QUESTION_MESSAGE);
            if(sx != null) {
                x = Integer.parseInt(sx);
                x = 2 * x;
                JOptionPane.showMessageDialog(null, s+"\n"+Integer.toString(x), "String and Twice Integer", JOptionPane.INFORMATION_MESSAGE);
            }
       }

    }
 }