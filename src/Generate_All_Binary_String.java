

import java.util.List;
import java.util.*;
public class Generate_All_Binary_String {


        public static  List<String> ans=new ArrayList<String>();

        public static void solve(int count,int n,String ip)
        {
            if(count==n)
            {
                ans.add(ip);
                return;
            }

            if(count==0)
            {
                solve(count+1,n,ip+"0");
                solve(count+1,n,ip+"1");
            }
            else
            {
                if(ip.charAt(ip.length()-1)!='1')
                {
                    solve(count+1,n,ip+"1");
                }
                solve(count+1,n,ip+"0");
            }

        }


        public static List< String > generateString(int N) {
            // Write your code here.
            String ip="";
            int count=0;
            solve(count,N,ip);
            return ans;
        }

    public static void main(String[] args) {

            int N=4;
        System.out.println( generateString(N));
    }
    }


