import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome_Partitioning {

    public static boolean isPalindrome(String str,int index,int i)
    {
        while(index<=i)
        {
            if(str.charAt(index++)!=str.charAt(i--))
                  return false;
        }
        return true;
    }

    public static void help(int index,String str,List<String> ans,List<List<String>> ar)
    {
        if(index==str.length())
        {
            ar.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<str.length();++i)
        {
            if(isPalindrome(str,index,i))
            {
                ans.add(str.substring(index,i+1));
                help(i+1,str,ans,ar);
                ans.remove(ans.size()-1);
            }
        }


    }
    public static void main(String[] args) {

        String str="aab";
        List<List<String>> ar = new ArrayList<>();
        List<String> ans=new ArrayList<>();

        help(0,str,ans,ar);
        System.out.println(ar);



    }
}
