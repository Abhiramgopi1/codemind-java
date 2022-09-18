import java.util.*;
class num
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a<0)
        {
            System.out.print("Negative Number");
        }
        else
        {
            System.out.print("Positive Number");
        }
    }
}