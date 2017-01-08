import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Buttons extends JPanel {
    public Buttons(){
        this.setLayout(new GridLayout(4,1));
        this.add(new JButton("Reset"));
        this.add(new JButton("Check"));
        this.add(new JButton("New Puzzle"));
	this.add(new JButton("Give Up"));
         
    }
}
