import java.util.*;
class prime
{
    static int isprime(int n)
     {
        if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for(int i = 0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        double c=0,d=0;
        for(int i=0;i<a;i++)
        {
            if(isprime(arr[i])==1)
            {
                d=d+arr[i];
                c++;
                
            }
        }
        double q= d/c;
        System.out.format("%.2f",q);
    }
}