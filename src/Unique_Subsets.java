import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Unique_Subsets {

    public static void solve(int index,ArrayList<Integer> ans, HashSet<ArrayList<Integer>>ar,int arr[])
    {

        if(index==arr.length)
        {
            ar.add(new ArrayList<>(ans));
            return;
        }
        solve(index+1,ans,ar,arr);
        ans.add(arr[index]);
        solve(index+1,ans,ar,arr);
        ans.remove(ans.size()-1);



    }



    public static void main(String[] args) {
        int arr[]={1,2,2};
      HashSet<ArrayList<Integer>>ar=new HashSet<>();
        solve(0,new ArrayList<Integer>(),ar,arr);
        System.out.println(ar);


    }



}
