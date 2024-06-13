import java.sql.SQLOutput;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1= sc.nextLine();
        char[] arr= str1.toCharArray();
        int left=0;
        int right=str1.length()-1;
        boolean check=true;
        while(left<right)
        {
           if(arr[left]!=arr[right])
           {
               check=false;
               break;
           }
           left++;
           right--;
        }
        if(!check) {
            System.out.println("Not palindrome");
        }
        else
        {
            System.out.println("String is palindrome");
        }

    }
}
