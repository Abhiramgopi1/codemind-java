import java.util.*;
class array
{
    public static void main(String asdd[])
    {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(int i=0;i<a;i++)
        {
            if(arr[i]%2==0)
            {
                list1.add(arr[i]);
            }
            else
            {
                list2.add(arr[i]);
            }
        }
         //System.out.print(list2.toString().replace("[","").replace("]","").replace(","," ")+" ");
         //System.out.print(list1.toString().replace("[","").replace("]","").replace(","," "));
         for(int i=0;i<list2.size();i++)
         {
             System.out.print(list2.get(i)+" ");
         }
         for(int i=0;i<list1.size();i++)
         {
             System.out.print(list1.get(i)+" ");
         }
    }
}