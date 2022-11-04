import java.util.*;
class strong
{
    static int fact(int n)
    {
        int c=1;
        if(n==1)
            return 1;
        for(int i=1;i<=n;i++)
        {
            c*=i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            s+=fact(d);
        }
        if(s==m)
        {
            System.out.println("The number "+m+" is a strong number");
        }
        else
        {
            System.out.println("The number "+m+" is not a strong number");
        }
        
    }
}