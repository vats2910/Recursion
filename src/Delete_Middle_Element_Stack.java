import java.util.Stack;

public class Delete_Middle_Element_Stack {
    public static void delete_mid(Stack<Integer> s,int k)
    {
        if(k==1)
        {
            s.pop();
            return;
        }

        int temp=s.pop();
        delete_mid(s,k-1);
        s.push(temp);
    }
    public static Stack<Integer> solve(Stack<Integer> s,int size)
    {
        if(size==0)
            return s;
        int k=size/2+1;
        delete_mid(s,k);
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(10);
        stack.push(9);
        stack.push(12);
        stack.push(17);

        solve(stack,stack.size());
        System.out.println(stack);
    }
}
