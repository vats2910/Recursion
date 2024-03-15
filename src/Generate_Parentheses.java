import java.util.ArrayList;

public class Generate_Parentheses
{

    public static void  solve(int o,int c,ArrayList<String>ar,String ans)
    {

        if(c==0 && o==0)
        {
            ar.add(ans);
          return;
        }

        if(o!=0)
        {
            String op=ans;
            op=op+"(";
            solve(o-1,c,ar,op);
        }
        if(c>o)
        {
         String op=ans;
         op=op+")";
         solve(o,c-1,ar,op);
        }
    }

    public static void main(String[] args) {
        int k=3;
        int open=k;
        int close=k;
        ArrayList<String> ar=new ArrayList<>();
        String ans="";
        solve(open,close,ar,ans);
        System.out.println(ar);
    }

}
