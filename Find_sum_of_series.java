import java.util.*;
class SUMOFSERIES
{
    public static void main(String A[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        double b=0;
        for(float i=1;i<=a;i++)
        {
            b+=1/i;
        }
        System.out.format("%.2f",b);
    }
}