package Star;

import java.util.Scanner;
public class StarPattern1
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the any Number to Print Star.");
        int no=s.nextInt();
        for(int i=1;i<=no;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
