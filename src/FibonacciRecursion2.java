public class FibonacciRecursion2
{
    static int a=0,b=1,c;
    public static void main(String[] args)
    {
        System.out.print(a+ " "+b);
        FibonacciRecursion2 ob =new FibonacciRecursion2();
        ob.printFib(15);
    }
    void printFib(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        printFib(i-1);
        }
    }
}
