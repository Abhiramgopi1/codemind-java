import java.util.*;
class CSE
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        if(a%2==0 && (a>0||b%2==0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}