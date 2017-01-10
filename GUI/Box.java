import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Box extends JPanel {
    public int CellNumber = 9;
    public JTextField[]cells = new JTextField[CellNumber];
    public Sudoku c = new Sudoku();
     
    public Box(int x, int y){
	int a = x;
	int b = y;
        this.setLayout(new GridLayout(3,3));
        this.setBorder(new LineBorder(Color.BLACK));
        for(int i = 0; i < CellNumber; i++){
	    if(a - x == 3){
		a = a - 3;
		b = b + 1;
	    }
	    if(c.get(a, b) == 0){
            cells[i] = new JTextField();
            this.add(cells[i]);
	    a++;}
	    else{cells[i] = new JTextField(c.get(a, b) + "");
		cells[i].setEditable(false);
		this.add(cells[i]);
		a++;}
        }
    }
}

// Cell is only a JTextfield since it only extends it so far and nothing was made yet. Therefore JTextField could work instead of cell aswell.
