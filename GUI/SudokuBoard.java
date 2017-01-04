import javax.swing.*;
import java.awt.*;

public class SudokuBoard extends JFrame{
    private Container pane;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;

    public SudokuBoard(){
        this.setTitle("Sudoku");
	this.setSize(300,300);
	this.setLocation(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout());
	pane.add(t1);
	pane.add(t2);
	pane.add(t3);
	pane.add(t4);
	pane.add(t5);
	pane.add(t6);
	pane.add(t7);
	pane.add(t8);
	pane.add(t9);
}

    public static void main(String [] args){
	SudokuBoard a = new SudokuBoard();
	a.setVisible(true);
    }
}



	    
	
