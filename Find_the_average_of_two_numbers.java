import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        double avg;
        avg = (a+b)/2;
        System.out.format("%.4f",avg);
    }
}