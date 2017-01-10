import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Board extends JFrame {
    public int BoxNumber = 9;
    public Box[]boxes = new Box[BoxNumber];
    public JPanel panel = new JPanel(new GridLayout(3,3));
     
    public Board(){
	this.setLayout(new GridLayout(1,1));
        this.setTitle("Sudoku");
        this.setSize(600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	boxes[0] = new Box(0,0);
	boxes[1] = new Box(3,0);
	boxes[2] = new Box(6,0);
        boxes[3] = new Box(0,3);
	boxes[4] = new Box(3,3);
	boxes[5] = new Box(6,3);   
        boxes[6] = new Box(0,6);
	boxes[7] = new Box(3,6);
	boxes[8] = new Box(6,6);   

	panel.add(boxes[0]);
	panel.add(boxes[1]);
	panel.add(boxes[2]);
	panel.add(boxes[3]);
	panel.add(boxes[4]);
	panel.add(boxes[5]);
	panel.add(boxes[6]);
	panel.add(boxes[7]);
	panel.add(boxes[8]);
	
        this.add(panel);

    }

}


