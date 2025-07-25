/*
 Given an array of integers and a non-negative integer k, your task is to rotate the array to the right by k positions. 
Rotation means that elements at the end of the array move to the beginning, and the rest of the elements shift to the right.

Input Format:
--------------
Line-1: An integer n, represents size of array
Line-2 to n: An integer array arr of length n.
Line-n+1: A non-negative integer k, representing the number of positions to rotate the array.

Output Format:
---------------
Line-1: Return the array after being rotated by k positions.

Constraints:
-------------
The rotation should be performed in place with O(1) extra space.
The time complexity should be O(n).

Sample Input-1:
---------------
5
1 2 3 4 5
2
Sample Output-1: 
----------------
4 5 1 2 3

Sample Input2:
--------------
5
1 2 3 4 5
5
Sample Output-2:
---------------
1 2 3 4 5

Sample Input-3:
---------------
5
1 2 3 4 5
7
Sample Output-3: 
----------------
4 5 1 2 3
 */
import java.util.Scanner;
public class RotateKElements {
    static void Rotate(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];    
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }    
        int k = sc.nextInt()%n;
        RotateElemntsByK(arr,k);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    private static void RotateElemntsByK(int[] arr, int k) {
        
        int n = arr.length;
        if(k == 0 || k == n) return;
        Rotate(arr,0,n-1);
        Rotate(arr,0,k-1);
        Rotate(arr,k,n-1);
    }
}
