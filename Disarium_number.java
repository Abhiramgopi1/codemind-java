import java.util.*;
class dis
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,k=0;
        String s = Integer.toString(n);
        int l = s.length();
        while(n>0)
        {
            int d=n%10;
            k=k+(int)Math.pow(d,l);
            l--;
            n=n/10;
        }
        if(m==k)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}