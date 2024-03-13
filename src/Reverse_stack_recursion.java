import java.util.Stack;

public class Reverse_stack_recursion {

    public static void solve(Stack<Integer> s,int n)
    {
        if(s.size()==0)
        {
            s.push(n);
            return;
        }
        int temp=s.pop();
        solve(s,n);
        s.push(temp);
        return;
    }

    public static void reverse(Stack<Integer>s)
    {
        if(s.size()==1)
        {
            return ;
        }
        int temp=s.pop();
        reverse(s);
        solve(s,temp);
        return;
    }

    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(2);
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(6);
        reverse(s);
        System.out.println(s);
    }

}
