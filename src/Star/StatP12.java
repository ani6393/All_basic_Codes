package Star;
import java.util.Scanner;
public class StatP12
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int no=s.nextInt();
        for(int i=no;i>=1;i--)
        {
           for(int j=no;j>i;j--)
           {
               System.out.print(" ");
           }
       for(int k=1;k<(i*2);k++)
       {
           if(k>1 && k<(i*2)-1)
           {
               System.out.print(" ");
           }
      else
      {
               System.out.print("*");
           }
       }
            System.out.println();
        }
    }
}
