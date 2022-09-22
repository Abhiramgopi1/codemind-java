import java.util.*;
class ele
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b =sc.nextInt();
        int c = sc.nextInt();
        int d=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                System.out.print(arr[i]+" ");
                d=1;
            }
        }
        if(d==0)
        {
            System.out.print("-1");
        }
    }
}