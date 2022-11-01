import java.util.*;
class win
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int M =sc.nextInt();
        int N =sc.nextInt();
        if (M % 2 == 0 || N % 2 == 0)
            System.out.println("Player 1");
        else
            System.out.println("Player 2");
    }
}