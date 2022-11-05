import java.util.*;
class ami
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0,c=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                c+=i;
            }
        }
        if(s==b && c==a)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}