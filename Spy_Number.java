import java.util.*;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0,c=1;
        while(a!=0)
        {
            int d=a%10;
            a=a/10;
            s+=d;
            c*=d;
        }
        if(s==c)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}