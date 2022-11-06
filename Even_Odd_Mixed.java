import java.util.*;
class sol
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int c=0,d=0,e=0;
        while(a!=0)
        {
            int b = a%10;
            a = a/10;
            e++;
            if(b%2==0)
            {
                c++;
            }
            else
            {
                d++;
            }
        }
        if(c==e)
        {
            System.out.print("Even");
        }
        else if(d==e)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}