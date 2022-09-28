import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            int a = sc.nextInt();
            int [] arr = new int[a];
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            double k = 0;
            double f= 0;
            for(int i=0;i<a;i++)
            {
                k +=arr[i];
            }
            f=k/a;
            System.out.format("%.2f",f);
        }
    }
}