import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Board extends JFrame {
    public int BoxNumber = 9;
    public Box[]boxes = new Box[BoxNumber];
    public JPanel panel = new JPanel(new GridLayout(3,3));
     
    public Board(){
	this.setLayout(new GridLayout(1,2));
        this.setTitle("Sudoku");
        this.setSize(600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
        for(int i = 0; i < BoxNumber; i++){
            boxes[i] = new Box();
            panel.add(boxes[i]);

        }

        this.add(panel);
	this.add(new Buttons());

    }

}
