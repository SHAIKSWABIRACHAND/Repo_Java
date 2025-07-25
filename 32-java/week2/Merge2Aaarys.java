/*
Given two sorted arrays arr1 and arr2 of sizes m and n, merge them without using extra space such that after merging, the first array (arr1) contains the first n smallest elements and the second array (arr2) contains the next m elements in sorted order. 
You are not allowed to use any extra space, i.e., the merging should be done in-place.

Input Format:
--------------
Line-1: Space separated two integers m and n, represents size of each array.
Line-2: A sorted integer array arr1 of length m
Line-3: A sorted integer array arr2 of length n 

Output Format:
---------------
Line-1: arr1 containing the smallest m elements
Line-2: arr2 containing the remaining elements in sorted order

Constraints:
-------------
No extra space (except a few variables for swapping).

Sample Input-1:
----------------
4 3
1 4 8 10
2 3 9

Sample Output-1:
-----------------
1 2 3 4
8 9 10

Sample Input-2:
----------------
3 5
1 5 9
2 4 6 8 10

Sample Output-2:
-----------------
1 2 4
5 6 8 9 10
 */

import java.util.*;

class Merge2Arrays {
    static void merging(int[] arr1, int[] arr2) {
        int extra =  0;
        int l1 = arr1.length;
        int l2 = arr2.length;
        for(int i = 0;i<l1;i++){
               for(int j = 0 ;j<l2;j++){
                if(arr1[i] > arr2[j]){
                    extra = arr1[l1-1];
                    arr1[l1-1] = arr2[j];
                    arr2[j] = extra;
                }
               } 
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];
        for (int i = 0; i < l1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < l2; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        merging(arr1, arr2);
        System.out.println();
        for (int i = 0; i < l1; i++) {  
            System.out.print(arr1[i] + " ");
        }   
        System.out.println();
        for (int i = 0; i < l2; i++) {  
            System.out.print(arr2[i] + " ");
        }

}
}