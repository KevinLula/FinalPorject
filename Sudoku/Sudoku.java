import java.util.Random;
import java.util.ArrayList;
public class Sudoku {
    
    ArrayList<Integer> sud = new ArrayList<Integer>();
    
    private int[][]puzzle = new int[9][9];

    public Sudoku(){
	refill();
    }

    public void refill(){
	for (int i = 1;i < 10;i++){
	    sud.add(i);
	}
    }

    public void create (){
	Random rand = new Random();
	for (int i = 0;i < 9;i++){
	    puzzle[0][i] = sud.remove(rand.nextInt(9-i));
	}
    }

    public void  get(){
	for (int i = 0;i < 9;i++){
	    System.out.println(puzzle[0][i]);
	}
    }

    public static void main(String []args){
	Sudoku s = new Sudoku();

	s.create();
	s.get();

    }

}