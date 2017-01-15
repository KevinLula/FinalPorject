import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI3 extends JFrame implements ActionListener{
     private Container pane;
     private JLabel j;
     private JTextField t;
     private JButton b, b2, b3, b4;

   public SettingsGUI3() {
    this.setTitle("Game Settings");
    this.setSize(300,200);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
    JButton b = new JButton("Easy");
    b.addActionListener(this);
    JButton b2 = new JButton("Medium");
    JButton b3 = new JButton("Hard");
    JButton b4 = new JButton("Create");
    JTextField t = new JTextField(10);
    JLabel j = new JLabel("Seed:");

    pane.add(j);
    pane.add(t);
    pane.add(b4);
    pane.add(b);
    pane.add(b2);
    pane.add(b3);
   }
    
     public void actionPerformed(ActionEvent e){
	 Board a = new Board();
	 a.setVisible(true);
	 this.setVisible(false);
     }

    public static void main(String [] args){
	SettingsGUI3 a = new SettingsGUI3();
	a.setVisible(true);
    }
}
