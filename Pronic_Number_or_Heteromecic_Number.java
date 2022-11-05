import java.util.*;
class pro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        for(int i=1;i<=a;i++)
        {
            if(a==i*(i+1))
            {
                s+=1;
            }
        }
        if(s==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}