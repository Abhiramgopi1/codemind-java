import java.util.*;
class palindrome
{
    public static void main(String art[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b = a,s=0;
        while(a!=0)
        {
            int n = a%10;
            s=s*10+n;
            a=a/10;
        }
        if(b==s)
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}