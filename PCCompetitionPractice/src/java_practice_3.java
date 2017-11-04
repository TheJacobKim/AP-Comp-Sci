// java_practice_3.java
import javax.swing.*;
    
public class java_practice_3 {
    
    public static void main(String[] args) {
        TextWindow textWindow = new TextWindow();
        textWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textWindow.setSize(520,520);
        textWindow.setVisible(true);
    }
}

class TextWindow extends JFrame {   //JFrame friendly subclass - MUST BE SAME IN FILE AS main !!
    JTextArea textArea;
    String s, sx;
    int x;
     
    public TextWindow() {     //default constructor
     super("practice");    //call constructor with frame title
     textArea = new JTextArea();  //construct textArea with default params
     add(new JScrollPane(textArea)); //add textArea wrapped in a scroll pane
     
     s = JOptionPane.showInputDialog(null, "Enter a string", "String", JOptionPane.QUESTION_MESSAGE);
        if(s != null) {
            sx = JOptionPane.showInputDialog(null, "Enter an integer", "Integer", JOptionPane.QUESTION_MESSAGE);
            if(sx != null) {
                x = Integer.parseInt(sx);
                x = 2 * x;
                textArea.append(s + "\n");
                textArea.append(Integer.toString(x));
            }
       }
    }
 }