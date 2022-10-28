import java.util.*;
class sol
{
    static int palin(int n)
    {
        int m=n;
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(m==s)
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
           int m=sc.nextInt();
            if(palin(m)==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        
    }
}