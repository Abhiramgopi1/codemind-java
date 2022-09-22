import java.util.*;
class min
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer>list=new ArrayList<>();
        int [] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=0;
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(arr[i]>=b && arr[i]<=c)
            {
                list.add(arr[i]);
                d=1;
            }
        }
        if(d==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(Collections.min(list));
        }
    }
}