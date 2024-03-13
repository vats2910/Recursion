import java.util.Scanner;

public class Power_of_X_to_N {

public static double solution (double x,long n)
{
    if(n==0)
    {
        return 1;
    }

    double ans=solution(x,n/2);
    ans=ans* ans;
    if(n%2==0)
    {
        return ans;
    }
    else
    {
        return ans*x;
    }

}
public static double solve(double x,int n)
{
    long temp=n;

    double ans =solution(x,Math.abs(n));
    if(temp<0)
    {
        return 1/ans;
    }
    return ans;
}
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        double  x=sc.nextDouble();
        int n=sc.nextInt();

        System.out.println(solve(x,n));
    }
}
