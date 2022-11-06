import java.util.*;
class sol
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
    static int palin(int a)
    {
        int s=0;
        int b=a;
        while(a!=0)
        {
            int d=a%10;
            s=s*10+d;
            a=a/10;
        }
        if(s==b)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a+1;i!=0;i++)
        {
            if(prime(i)==1)
            {
                if(palin(i)==1)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}