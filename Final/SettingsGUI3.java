import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class SettingsGUI3 extends JFrame implements ActionListener{
     private Container pane;
     private JLabel j, j2;
     private JTextField t, t2;
     private JButton b, b2, b3, b4;

   public SettingsGUI3() {
    this.setTitle("Game Settings");
    this.setSize(300,200);
    this.setLocation(300,300);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    pane = this.getContentPane();
    pane.setLayout(new FlowLayout());
    JButton b = new JButton("Easy");
    b.addActionListener(this);
    b.setActionCommand("Easy");
    JButton b2 = new JButton("Medium");
    b2.addActionListener(this);
    b2.setActionCommand("Medium");    
    JButton b3 = new JButton("Hard");
    b3.addActionListener(this);
    b3.setActionCommand("Hard");    
    JButton b4 = new JButton("Create");
    b4.addActionListener(this);
    b4.setActionCommand("Create");
    t = new JTextField(15);
    t2 = new JTextField(15);
    JLabel j2 = new JLabel("Difficulty:       ");
    JLabel j = new JLabel("Board Number:");

    pane.add(j);
    pane.add(t);
    pane.add(j2);
    pane.add(t2);
    pane.add(b4);
    pane.add(b);
    pane.add(b2);
    pane.add(b3);
   }
    
     public void actionPerformed(ActionEvent e){
	 String event = e.getActionCommand();
	 if(event.equals("Easy")){
	 Board a = new Board("Easy");
	 a.setVisible(true);
	 this.setVisible(false);}
	 	 if(event.equals("Medium")){
	         Board b = new Board("Medium");
	         b.setVisible(true);
		 this.setVisible(false);}
	 	         if(event.equals("Hard")){
	                 Board c = new Board("Hard");
	                 c.setVisible(true);
	                 this.setVisible(false);}
	                            if(event.equals("Create")){
					try{
					    Integer.parseInt(t.getText());}
					catch(NumberFormatException f){System.out.println("NumberFormatException: The text box Seed requires an integer.");}
					if(t2.getText().equals("Easy") || t2.getText().equals("Medium") || t2.getText().equals("Hard")){
					Board d = new Board(Integer.parseInt(t.getText()),t2.getText());
	                            d.setVisible(true);
	                            this.setVisible(false);}
					    else{System.out.println("The only available difficulties are Easy, Medium, and Hard");
					    }
				    }
					    
     }

    public static void main(String [] args){
	SettingsGUI3 a = new SettingsGUI3();
	a.setVisible(true);
    }
}
