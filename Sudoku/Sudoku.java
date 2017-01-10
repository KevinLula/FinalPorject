import java.util.Random;
public class Sudoku{
    
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

    public Sudoku(){
	Random rand = new Random();
        for (int i = 0; i < rand.nextInt(1000)*100;i++){
            mix();
        }
    }

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
            int col = rand.nextInt(3);
            col += (3*i);
            for (int r = 0; r<9;r++){
                int temp = ans[r][col];
                int newCol = rand.nextInt(3) + (3*i);
                ans[r][col] = ans[r][newCol];
                ans[r][newCol] = temp;
            }
        }
    }



    //main===============================                                                                                                                                            
    public static void main(String []args){
        Sud s1 = new Sud();
        //s1.newFill();                                                                                                                                                              
        System.out.println(s1);

    }

}
																			