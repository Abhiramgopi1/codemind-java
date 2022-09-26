import java.util.*;
class SUMOFNATURALNUMBERS
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b = (a*(a+1))/2;
        System.out.print(b);
    }
}