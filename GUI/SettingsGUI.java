import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI extends JFrame{
     private Container pane;
     private JLabel j;
     private JTextField t;
    private JButton b, b2, b3, b4 ;

   public SettingsGUI() {
    this.setTitle("Game Settings");
    this.setSize(300,200);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new BorderLayout());
    JButton b = new JButton("Easy");
    JButton b2 = new JButton("Medium");
    b2.setPreferredSize(new Dimension (50,50));
    JButton b3 = new JButton("Hard");
    JButton b4 = new JButton("Create");
    t = new JTextField(10);
     j = new JLabel("Board Number");
     pane.add(b, BorderLayout.LINE_START);
     pane.add(b2, BorderLayout.CENTER);
     pane.add(b3, BorderLayout.LINE_END);
     pane.add(b4, BorderLayout.PAGE_END);
   }

    public static void main(String [] args){
	SettingsGUI a = new SettingsGUI();
	a.setVisible(true);
    }
}
