public classs Code_5
{
    public static boolean isSafe(int sudoku[][],int row,int col,int digit)
    { //col
        for(int i=0;i<=8;i++)
        {
            if(sudoku[i][col]==digit){
            return false;
            }
        }
        //row
        for(int j=0;j<=8;j++)
        {
             if(sudoku[row][j]==digit){
            return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
               if(sudoku[i][j]==digit)
               {
                return false;
               }
            }
        }
        return true;
    }
    public static void sudokuSolver(int sudoku[][],int row,int col)
    {
     //base
     if(row==9 && col==0)
     {
        return true;
     }
      //recursion
      int nextRow=row,nextCol=col+1;
      if(col+1==9)
      {
        nextRow=row+1;
        nextCol=0;
      }
      if(sudoku[row][col]!=0)
      {
        return sudokuSolver(sudoku,nextRow,nextCol);
      }
      for(int digit=1;digit<=9;digit++)
      if(isSafe(sudoku,row,col,digit))
      {
        sudoku[row][col]=digit;
      }
    }
    public static void main(String args[])
    {
        int sudoku[][]=
        {
            {4,9,0,1,5,7,0,0,2},
            {0,0,8,0,0,0,0,0,0},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,6},
            {0,0,0,0,2,0,0,6,0},
            {9,6,8,4,0,5,3,0,0},
            {8,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1.3}
        }
    };
    if(sudokuSolver(sudoku,0,0))
    {
         System.out.println("sudoku exist");
         printSudolu(sudoku);
    }
}