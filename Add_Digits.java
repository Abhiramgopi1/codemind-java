import java.util.*;
class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int n = (a-1)%9+1;
        System.out.print(n);
    }
}