package Star;

import java.util.Scanner;
public class StarPR2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the any number");
        int no=s.nextInt();
        for(int i=1;i<=no;i++)
        {
            for(int j=no;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
