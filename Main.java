import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CW T G N I E OR ODD");
        int s = sc.nextInt();
        if(s%2==0)
        {
             System.out.println("EVEN");
        }
        else
        {
             System.out.println("odd");
        }
        sc.close();
    }
}