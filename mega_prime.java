import java.util.*;
class mega
{
    static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else
        {
            for(int i=2;i<Math.sqrt(n)+1;i++)
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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int s=0,c=0;
        if(prime(a)==1)
        {
            while(a!=0)
            {
                int d=a%10;
                a=a/10;
                s+=1;
                if(prime(d)==1)
                {
                    c+=1;
                }
            }
            if(s==c)
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
        
    }
}