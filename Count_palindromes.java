import java.util.*;
class palindrome
{
    static int is_palin(int n)
    {
        int d=n,s=0;
        while(n!=0)
        {
            int a = n%10;
            s=s*10+a;
            n=n/10;
        }
        if(d==s)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=scan.nextInt();
        }
        int c=0;
        scan.close();
        for(int i=0;i<a;i++)
        {
            if(is_palin(arr[i])==1)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}