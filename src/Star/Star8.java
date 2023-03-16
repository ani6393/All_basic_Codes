package Star;
public class Star8 {
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
        {
            for (int j=10;j>=i;j--)
            {
                System.out.print(" ");
            }
        for(int k=0;k<=i;k++){
            System.out.print("A");
        }
        for(int l=0;l<=i;l++){
            System.out.print("B");
        }
            System.out.println();
        }
    }
}
