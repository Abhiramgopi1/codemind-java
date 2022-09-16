import java.util.*;
class Handshakes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = (a*(a-1)/2);
        System.out.print(b);
    }
}