import java.util.Scanner;
class table3
{
    public static void main(String[]args)
    {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the any number");
  int no=s.nextInt();
  for(int i=1;i<=10;i++)
  {
      System.out.println(no+" * "+i+" = "+no*i);
  }
    }
}