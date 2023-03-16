import java.util.Scanner;
public class ileap
{
    public static void main(String[]args){
     Scanner s=new Scanner(System.in);
     System.out.println("enter the year");
     int year=s.nextInt();
     if ((year%400==0)||(year%4==0 && year!=0))
     {
       System.out.println("Leap Year");
     }
            else
     {
         System.out.println("not a leap year");
        }
    }
}
