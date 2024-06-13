import java.util.Scanner;
public class FindLargestValue {
    public static int largest(int arr[], int n)
    {
        int value=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>value)
            {
                value=arr[i];
            }
        }
        return value;
    }

        public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int ans= largest(arr,n);
        System.out.println(ans);
    }
}
