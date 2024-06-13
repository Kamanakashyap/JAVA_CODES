import java.util.Scanner;

public class NumberCrownPattern {
    public static void numberCrown(int n) {
        int temp=n;
        for(int i=1;i<=temp;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (int j=1;j<=n*2-2;j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        numberCrown(n);

    }
}
