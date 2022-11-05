import java.util.*;
class primeee
{
    static int prime(int a)
    {
        if(a==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<Math.sqrt(a)+1;i++)
            {
                if(a%i==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(prime(a)==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}