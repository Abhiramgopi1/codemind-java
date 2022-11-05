import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a!=0)
        {
            int d=a%10;
            s=s*10+d;
            a=a/10;
        }
        System.out.println(s);
    }
}