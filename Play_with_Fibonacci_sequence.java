import java.util.*;
class Fibonacci
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=0;
        int c=1;
        System.out.print("0 ");
        System.out.print("1 ");
        int i = 1;
        while(i<a-1)
        {
            int d = b + c;
            b = c;
            c = d;
            System.out.print(c+" ");
            i++;
        }
    }
}