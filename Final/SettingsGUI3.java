import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI3 extends JFrame implements ActionListener{
     private Container pane;
     private JLabel j;
     private JTextField t;
     private JButton b, b2, b3, b4;
     public Sudoku c = new Sudoku();
     public Board a = new Board(c);
     public Board2 d = new Board2(c);

   public SettingsGUI3() {
    this.setTitle("Game Settings");
    this.setSize(300,200);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
    JButton b = new JButton("Play");
    b.addActionListener(this);
    pane.add(b);
   }

     public Board2 getSolvedBoard(){
	return d;
}

     public Board getUnSolvedBoard(){
	return a;
}
    
     public void actionPerformed(ActionEvent e){
	a.setVisible(true);
	d.setVisible(false);
     }

    public static void main(String [] args){
	SettingsGUI3 a = new SettingsGUI3();
	a.setVisible(true);
    }
}
