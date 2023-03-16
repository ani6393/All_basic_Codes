import java.util.Scanner;

class FibonacciSeries
{
    public static void main(String[] args){
    String yn;
    do {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no1");
        int no1 = s.nextInt();
        System.out.println("enter the no2");
        int no2 = s.nextInt();
        int a = no1, b = no2;
        System.out.print(a + " " + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        System.out.println(".  do you want to continue (press y for yes and press n for no).");
        yn = s.next();
    }
    while(yn.equals("y") || yn.equals("Y"));
    }
}