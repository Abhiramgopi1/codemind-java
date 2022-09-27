import java.util.*;
class solutions
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            int n=0;
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]==arr[j])
                {
                    n++;
                }
            }
            if(n==0)
            {
                if(arr[i]%2==0)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}