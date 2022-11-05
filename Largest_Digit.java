import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a!=0)
        {
            int d=a%10;
            if(d>s)
            {
                s=d;
            }
            a=a/10;
        }
        System.out.println(s);
    }
}