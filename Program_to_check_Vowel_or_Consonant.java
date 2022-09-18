import java.util.*;
class alpha
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='O' || a=='o' || a=='u' || a=='U')
        {
            System.out.print("Vowel");
        }
        else
        {
            System.out.print("Consonant");
        }
    }
}