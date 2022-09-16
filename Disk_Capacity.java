import java.util.*;
class disk
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,k;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        k = 2*a*b*c*512;
        System.out.print(k);
    }
}