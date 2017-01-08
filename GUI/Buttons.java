import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Buttons extends JPanel {
    public Buttons(){
        this.setLayout(new GridLayout(5,1));
        this.add(new JButton("Reset"));
        this.add(new JButton("Solve"));
        this.add(new JButton("New Puzzle"));
         
    }
}
