import java.util.*;
class sol
{
    static int fact(int n)
    {
        int c=1;
        for(int i=1;i<=n;i++)
        {
            c*=i;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            System.out.println(fact(b));
        }
    }
}