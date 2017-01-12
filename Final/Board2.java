import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Board2 extends JFrame {
    public int BoxNumber = 9;
    public Box2[]boxes = new Box2[BoxNumber];
    public JPanel panel = new JPanel(new GridLayout(3,3));
     
    public Board2(Sudoku c){
	this.setLayout(new GridLayout(1,1));
        this.setTitle("Sudoku");
        this.setSize(600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	boxes[0] = new Box2(0,0,c);
	boxes[1] = new Box2(3,0,c);
	boxes[2] = new Box2(6,0,c);
        boxes[3] = new Box2(0,3,c);
	boxes[4] = new Box2(3,3,c);
	boxes[5] = new Box2(6,3,c);   
        boxes[6] = new Box2(0,6,c);
	boxes[7] = new Box2(3,6,c);
	boxes[8] = new Box2(6,6,c);   

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


