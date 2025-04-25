/*
 Write a function that reverses a string. The input string is given as an array 
of characters s. You must do this by modifying the input array in-place with 
O(1) extra memory.

Sample test case

case=1
input=batch-A
output=A-hctab

case=2
input=Never_give_up
output=pu_evig_reveN

 */
import java.util.Scanner;
class Test
{
    
    static void Return(char arr[])
    {
        int n = arr.length;
        int left = 0,right = n-1;
        while(left<right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        Return(arr);
        System.out.println(new String(arr));
        
    }
    
}
