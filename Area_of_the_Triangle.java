import java.util.*;
class area
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        double s,y;
        s = (a+b+c)/2;
        y = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",y);
    }
}