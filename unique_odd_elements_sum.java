import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
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
                if(arr[i]%2!=0)
                {
                    c+=arr[i];
                }
            }
        }
        System.out.print(c);
    }
}