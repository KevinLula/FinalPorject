import javax.swing.*;
import java.awt.*;

public class SudokuBoard extends JFrame{
    private Container pane;
    private JPanel[][] Box = new JPanel[3][3];
    private JTextField[][] Text = new JTextField[9][9];

	public void setTextFields(){
	for(int x = 0; x < Text.length; x++){
		for(int y = 0; y < Text[0].length; y++){
			Text[x][y] = new JTextField();
}
}
}

	public void addTextFields(){
	for(int x = 0; x < Text.length; x++){
		for(int y = 0; y < Text[0].length; y++){
		pane.setLayout(new GridLayout(9, 9));
		pane.add(Text[x][y]);
}
}
}

	public SudokuBoard(){
	this.setTitle("Sudoku");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setTextFields();
	this.addTextFields();
}


	public static void main(String [] args){
	SudokuBoard a = new SudokuBoard();
	a.setVisible(true);
}
}







	    
	
