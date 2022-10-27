import java.util.*;
class pal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int s=0,d;
        while(a!=0)
        {
            d=a%10;
            s=s*10+d;
            a=a/10;
        }
        if(b==s)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}