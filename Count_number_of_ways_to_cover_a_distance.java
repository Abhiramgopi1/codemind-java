import java.util.*;
class dis
{
    static int Count(int x)
    {
        if (x<0)   
            return 0;
        if (x==0)   
            return 1;
        return Count(x-1) +
               Count(x-2) +
               Count(x-3);
    }
     
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(Count(x));
    }
}