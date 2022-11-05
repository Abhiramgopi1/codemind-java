import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        Set<Integer> l1= new HashSet<>();
        while(a!=0)
        {
            int d =a%10;
            a=a/10;
            l1.add(d);
            s++;
        }
        if(s==l1.size())
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}