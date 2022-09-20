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
        int b = sc.nextInt();
        int c = 0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i)==1)
            {
                c++;
            }
        }
        System.out.print(c);
        
    }
}