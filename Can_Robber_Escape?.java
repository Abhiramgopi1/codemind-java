import java.util.*;
class robb
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int s=0;
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(arr[i]%2==1)
            {
                s++;
            }
        }
        if(s<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}