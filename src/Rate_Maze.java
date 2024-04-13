import java.util.ArrayList;

public class Rate_Maze {

    public static void help(int row,int col,int n,String s, int[][] a,ArrayList<String> ans,int [][] vis)
    {
        if(row==n-1 && col==n-1 )
        {
            ans.add(s);
            return;
        }
        //down
         if(row+1<n && vis[row+1][col]==0 && a[row+1][col]==1)
         {
             vis[row][col]=1;
             help(row+1,col,n,s+"D",a,ans,vis);
             vis[row][col]=0;
         }
         //left
        if(col-1>0 && vis[row][col-1]==0 && a[row][col-1]==1)
        {
            vis[row][col]=1;
            help(row,col-1,n,s+"L",a,ans,vis);
            vis[row][col]=0;
        }
        //right
        if(col+1<n && vis[row][col+1]==0 && a[row][col+1]==1)
        {
            vis[row][col]=1;
            help(row,col+1,n,s+"R",a,ans,vis);
            vis[row][col]=0;
        }
        //upper
        if(row-1>0 && vis[row-1][col]==0 && a[row-1][col]==1)
        {
            vis[row][col]=1;
            help(row-1,col,n,s+"U",a,ans,vis);
            vis[row][col]=0;
        }


    }

    public static void main(String[] args) {
        int n=4;
        String s="";
        int[][] a = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int [][] vis={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        ArrayList<String> ans=new ArrayList<>();

        help(0,0,n,s,a,ans,vis);
        System.out.println(ans);
    }






}
