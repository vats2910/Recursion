import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void solve(int index,int [] arr,ArrayList<Integer>ds,int target,List<List<Integer>> ar)
    {
       if(index==arr.length)
       {
           if(target==0) {
               ar.add(new ArrayList<>(ds));
           }
           return;
       }

       if(target>=arr[index])
       {
          ds.add(arr[index]);
          solve(index,arr,ds,target-arr[index],ar);
          ds.remove(ds.size()-1);
       }
       solve(index+1,arr,ds,target,ar);
    }

    public static void main(String[] args) {

        int arr[]={2,3,6,7};
        int target=7;
        List<List<Integer>> ar=new ArrayList<>();
        solve(0,arr,new ArrayList<Integer>(),target,ar);
        System.out.println(ar);
    }
}
