import java.util.ArrayList;
import java.util.List;

public class Nqueen {

    public  static List<String> construct(char [][] board)
    {
        List<String> ans=new ArrayList<>();

        for(int i=0;i<board.length;i++)
        {
            /*String s=new String(board[i]);*/
            ans.add(String.valueOf(board[i]));
        }
        return ans;
    }

    public static void solve(int col, char [][] board,List<List<String>> ans,  int [] leftRow,   int lowDia[],int updia[])
    {
        if(col==board.length)
        {
            ans.add(construct(board));
            return;
        }

        for(int row=0;row<board.length;row++)
        {
            if(leftRow[row]==0 && lowDia[row+col]==0 && updia[(board.length-1)+(col-row)]==0)
            {
                board[row][col]='Q';
                leftRow[row]=1;
                lowDia[row+col]=1;
                updia[(board.length-1)+(col-row)]=1;
                solve(col+1,board,ans,leftRow,lowDia,updia);
                board[row][col]='.';
                leftRow[row]=0;
                lowDia[row+col]=0;
                updia[(board.length-1)+(col-row)]=0;
            }
        }
    }

    public static void main(String[] args) {
        int n=4;
        char [][] board= new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        int [] leftRow=new int[n];
        int lowDia[]=new int[2*n-1];
        int updia[]=new int[2*n-1];


        solve(0,board,ans,leftRow,lowDia,updia);
        System.out.println(ans);

    }
}
