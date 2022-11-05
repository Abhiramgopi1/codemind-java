import java.util.*;
class circular
{
    static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else
        {
            for(int m=2;m<Math.sqrt(n)+1;m++)
            {
                if(n%m==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    static int rev(int n)
    {
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=rev(a);
        if(prime(a)==1 && prime(m)==1)
        {
            System.out.println("circular prime");
        }
        else if(prime(a)==1)
        {
            System.out.println("prime but not a circular prime");
        }
        else
        {
            System.out.println("not prime");
        }
        
    }
}