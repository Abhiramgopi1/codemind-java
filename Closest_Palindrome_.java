import java.util.*;
class closPalin
{
    static int pal(int x)
    {
        int y=x;
        int s=0;
        while(x!=0)
        {
            int d=x%10;
            s=s*10+d;;
            x=x/10;
        }
        if(y==s)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int m=0,n=0,q=0,w=0;
        for(int i=a-1;i!=0;i--)
        {
            if(pal(i)==1)
            {
                m=i;
                break;
            }
        }
        int o=a+1;
        while(o!=0)
        {
            if(pal(o)==1)
            {
                n=o;
                break;
            }
            o++;
        }
        q = a-m;
        w = n-a;
        if(q==w)
        {
            System.out.print(m+" ");
            System.out.print(n);
        }
        else if(q<w)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println(n);
        }
    }
}