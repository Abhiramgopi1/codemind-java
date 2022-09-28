import java.util.*;
class cost
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int cost;
        int area=((l+(2*w))*(b+(2*w)))-(l*b);
        cost=area*c;
        System.out.println(cost);
    }
}