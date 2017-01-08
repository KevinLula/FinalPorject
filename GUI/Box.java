import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;
import javax.swing.border.*;

public class Box extends JPanel {
    public int CellNumber = 9;
     
    public Cell[]cells = new Cell[CellNumber];
     
    public Box(){
        this.setLayout(new GridLayout(3,3));
        this.setBorder(new LineBorder(Color.BLACK));
        for(int i = 0; i < CellNumber; i++){
            cells[i] = new Cell();
            this.add(cells[i]);
        }
    }
}

// Cell is only a JTextfield since it only extends it so far and nothing was made yet. Therefore JTextField could work instead of cell aswell.
