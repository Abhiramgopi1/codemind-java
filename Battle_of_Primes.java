import java.util.*;
class battle
{
    static int prime(int i)
    {
        if(i==1)
        {
            return 0;
        }
        else
        {
            for(int j=2;j<Math.sqrt(i)+1;j++)
            {
                if(i%j==0)
                {
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String args[])
    {
         Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i=1,c=0,m=0;
        int v = a+b;
        while(i!=0)
        {
            int n=v+i;
            if(prime(n)==1)
            {
                m=n;
                break;
            }
            i++;
        }
        System.out.print(Math.abs((a+b)-m));
        
    }
}