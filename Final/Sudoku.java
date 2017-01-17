import java.util.Random;
public class Sudoku{

    private int seed;
    
    private Random randgen;
    
    private int [][]ans = {{3,2,9,6,5,7,8,4,1},
			   {7,4,5,8,3,1,2,9,6},		
			   {6,1,8,2,4,9,3,7,5},
			   {1,9,3,4,6,8,5,2,7},
			   {2,7,6,1,9,5,4,8,3},
			   {8,5,4,3,7,2,6,1,9},
			   {4,3,2,7,1,6,9,5,8},
			   {5,8,7,9,2,3,1,6,4},
			   {9,6,1,5,8,4,7,3,2}
    };

    private int [][]puzzle = new int[9][9];

    public Sudoku(){
	seed = (int)(Math.random() * 10000);
	randgen = new Random(seed);
        for (int i = 0; i < randgen.nextInt(1000)*100;i++){
            mix();
        }
        ansToPuzz();
        remove();
    }


    public Sudoku(int Seed){
	seed = Seed;
        randgen = new Random(seed);
        for (int i = 0; i < randgen.nextInt(1000)*100;i++){
            mix(randgen);
        }
	ansToPuzz();
	remove(randgen);
    }

    public Sudoku(int Seed,String diff){
        seed = Seed;
	randgen = new Random(seed);
        for (int i = 0; i < randgen.nextInt(1000)*100;i++){
            mix(randgen);
        }
        ansToPuzz();
        remove(randgen, diff);
    }
    
        public Sudoku(String diff){
	seed = (int)(Math.random() * 10000);
        randgen = new Random(seed);
        for (int i = 0; i < randgen.nextInt(1000)*100;i++){
            mix(randgen);
        }
        ansToPuzz();
	remove(randgen, diff);
	}
 


    public void ansToPuzz(){
        for (int r = 0; r < 9; r++){
            for (int c = 0;c < 9; c++){
                puzzle[r][c] = ans[r][c];
            }
        }
    }

    //getter========================================================


    //================================================================

    public void mix(){
        Random rand = new Random();
	
        for (int i = 0; i<3;i++){
            int row = rand.nextInt(3);
            row += (3*i);
            int[]temp = ans[row];
            int newRow = rand.nextInt(3) + (3*i);
            ans[row] = ans[newRow];
            ans[newRow] = temp;
	}
        for (int i = 0; i<3;i++){
            int col = rand.nextInt(3) + (3*i);
	    int newCol = rand.nextInt(3) + (3*i);
            for (int r = 0; r<9;r++){
                int temp = ans[r][col];
                ans[r][col] = ans[r][newCol];
                ans[r][newCol] = temp;
            }
	}
    }

        public void mix(Random randgen){	
        for (int i = 0; i<3;i++){
            int row = randgen.nextInt(3);
            row += (3*i);
            int[]temp = ans[row];
            int newRow = randgen.nextInt(3) + (3*i);
            ans[row] = ans[newRow];
            ans[newRow] = temp;
	}
        for (int i = 0; i<3;i++){
            int col = randgen.nextInt(3) + (3*i);
	    int newCol = randgen.nextInt(3) + (3*i);
            for (int r = 0; r<9;r++){
                int temp = ans[r][col];
                ans[r][col] = ans[r][newCol];
                ans[r][newCol] = temp;
            }
	}
    }

    //================================================================

    public void remove(){
        Random rand =  new Random();
        for (int i = 0; i < (27);i++){
            puzzle[rand.nextInt(9)][rand.nextInt(9)] = 00;
        }
    }


    public void remove(Random randgen){
	for (int i = 0; i < 25;i++){
	    puzzle[randgen.nextInt(9)][randgen.nextInt(9)] = 00;
	}
    }

    public void remove(Random randgen, String diff){
	if(diff.equals("Easy")){
	for (int i = 0; i < 25;i++){
	    puzzle[randgen.nextInt(9)][randgen.nextInt(9)] = 00;
	}}
	    if(diff.equals("Medium")){
	    for (int i = 0; i < 40;i++){
	    puzzle[randgen.nextInt(9)][randgen.nextInt(9)] = 00;
	    }}
	        if(diff.equals("Hard")){
	        for (int i = 0; i < 50;i++){
	        puzzle[randgen.nextInt(9)][randgen.nextInt(9)] = 00;
	        }}		    
	    
    }    

    //toString======================================================

    public String toString(){
	String answer = "";
	for (int row = 0;row <9;row++){
	    for (int col = 0;col<9;col++){
		answer += "[" + ans[row][col] + "]";
	    }
	    answer += "\n";
	}
	return answer;
    }
   
    public int get(int row,int col){
	return ans[row][col];
    }

    public int getPuzzle(int row, int col){
	return puzzle[row][col];
    }

    public int getSeed(){
	return seed;
    }

 
//===========================================
    public boolean checkColRow(int row, int col){
	for (int c = 0;c < 9; c ++){
	    if (c != col){
		if (ans[row][c] == ans[row][col]){
		    return false;
		}
	    }
	}
	for (int r = 0;r < 9;r++){
	    if (r != row){
		if (ans[r][col] == ans[row][col]){
		    return false;
		}
	    }
	}
	return true;
    }
		    
		    
    //===========================================
    
    

    //UNNECESSARY============================================================================
    public boolean whichBoxCheck(int row, int col){
	if (row < 3 && col < 3){
	    return boxCheck(row,col,0,3,0,3);
	}
	else if (row < 3 && col < 6){
	    return boxCheck(row,col,0,3,3,6);
	}
	else if (row < 3 && col < 9){
	    return boxCheck(row,col,0,3,6,9);
	}
	else if (row < 6 && col < 3){
	    return boxCheck(row,col,3,6,0,3);
	}
	else if (row < 6 && col < 6){
	    return boxCheck(row,col,3,6,3,6);
	}
	else if (row < 6 && col < 9){
	    return boxCheck(row,col,3,6,6,9);
	}
	else if (row < 9 && col < 3){
	    return boxCheck(row,col,6,9,0,3);
	}
	else if (row < 9 && col < 6){
	    return boxCheck(row,col,6,9,3,6);
        }
	else {
	    return boxCheck(row,col,6,9,6,9);
        }
    }

    //UNNECESSARY===========================================================================
    public boolean boxCheck(int r, int c,int rmin, int rmax, int cmin, int cmax){
	for (int row = rmin; row < rmax; row ++){
	    for (int col = cmin;col < cmax; col ++){
		if (row != r && col != c){
		    if (ans[row][col]==(ans[r][c])){
			return false;
		    }
		}
	    }
	}
	return true;
    }


    //main===============================                                                                                                                                            
    public static void main(String []args){
        Sudoku s1 = new Sudoku();
        //s1.newFill();             
	
        //System.out.println(s1);
	
	System.out.println(s1.checkColRow(6,6)); 


    }

}
																			
