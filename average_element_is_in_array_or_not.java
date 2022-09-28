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
            int sum=0,avg=0;
            for(int i=0;i<a;i++)
            {
                sum+=arr[i];
            }
            avg=sum/a;
            int c =0;
            for(int i=0;i<a;i++)
            {
                if(avg==arr[i])
                {
                    System.out.print("True");
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print("False");
            }
        }
    }
}