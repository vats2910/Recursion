import java.util.Stack;

public class Sort_Stack_Recursion {
    public static void insert(Stack<Integer>s,int n)
    {
        if(s.size()==0 || s.peek()<=n)
        {
            s.push(n);
            return;
        }
        int temp=s.pop();
        insert(s,n);
        s.push(temp);
        return ;
    }

    public static Stack<Integer> sort(Stack<Integer>s)
    {
        if(s.size()==1)
        {
            return s;
        }
        int temp=s.pop();
        sort(s);
        insert(s,temp);

        return s;
    }

    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(1);
        s.push(3);
        s.push(0);
        System.out.println(sort(s));



    }

}
