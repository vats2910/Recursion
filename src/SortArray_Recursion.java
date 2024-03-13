import java.util.ArrayList;
import java.util.List;

public class SortArray_Recursion {

    public static void insert(ArrayList<Integer>arr,int r)
    {
       if(arr.size()==0 || arr.get(arr.size()-1)<=r)
       {
           arr.add(r);
           return;
       }
       int temp=arr.get(arr.size()-1);
       arr.remove(arr.size()-1);
       insert(arr,r);
       arr.add(temp);
  return;
    }

    public static ArrayList<Integer> sortArray(ArrayList<Integer> arr)
    {
         if(arr.size()==1)
         {
             return arr;
         }
         int temp=arr.get(arr.size()-1);
         arr.remove(arr.size()-1);
         sortArray(arr);
         insert(arr,temp);

          return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(23);
        arr.add(6);
        arr.add(10);
        arr.add(11);
        sortArray(arr);
        System.out.println(arr);

    }

}
