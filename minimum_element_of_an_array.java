import java.util.*;
class avg
{
     static void min(int n,int arr[])
    {
        int m = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<m)
            {
                m=arr[i];
            }
        }
        System.out.print(m);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        min(a,arr);
        }
    }
}