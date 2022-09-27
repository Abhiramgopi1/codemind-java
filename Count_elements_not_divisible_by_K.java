import java.util.*;
class count
{
    public static void main(String asd[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}