import java.util.*;
class fibi
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0,n2=1,n3=0;
        while(n3<n)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        if(n3==n)
        {
            System.out.print("True");
        }
        else
        {
             System.out.print("False");
        }
        
        
        
    }
}