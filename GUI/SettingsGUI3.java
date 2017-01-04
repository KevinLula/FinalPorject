import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI3 extends JFrame{
     private Container pane;
     private JLabel j;
     private JTextField t;
    private JButton b, b2, b3, b4 ;

   public SettingsGUI3() {
    this.setTitle("Game Settings");
    this.setSize(300,200);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
    JButton b = new JButton("Easy");
    JButton b2 = new JButton("Medium");
    JButton b3 = new JButton("Hard");
    JButton b4 = new JButton("Create");
    b4.setPreferredSize(new Dimension(300,30));
    t = new JTextField(10);
    j = new JLabel("Board Number");
    pane.add(j);
    pane.add(t);
    pane.add(b4);
    pane.add(b);
    pane.add(b2);
    pane.add(b3);
   }

    public static void main(String [] args){
	SettingsGUI3 a = new SettingsGUI3();
	a.setVisible(true);
    }
}
