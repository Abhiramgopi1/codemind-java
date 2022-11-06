import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=1,c=0;
        while(a!=0)
        {
            int d=a%10;
            a=a/10;
            s*=d;
            c+=d;
        }
        System.out.print(s-c);
    }
}