import java.util.*;
class neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*n;
        int s=0;
        while(m!=0)
        {
            int d=m%10;
            m=m/10;
            s+=d;
        }
        if(n==s)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}