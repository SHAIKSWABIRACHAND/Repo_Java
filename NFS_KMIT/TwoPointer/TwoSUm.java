/*
Given a sorted array of unique integers and a target integer, return true if 
there exists a pair of numbers that sum to target, false otherwise.

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, 
return true because 4 + 9 = 13.

Sample test case
case=1
input=8
1 2 4 6 8 9 14 15
13
output=true

case=2
input=8
1 2 4 6 8 9 14 15
30
output=false
*/

import java.util.Scanner;
class TwoSum{
    static boolean DoesPairExists(int[] a,int sum){
        int n = a.length;
        for(int i = 0;i<n;i++){
            int target = sum -a[i];
            int left = i+1;
            int right = n-1;
            int mid = left+(right-left)/2;
            while(left<=right){
                if(a[mid] == target)
                    return true;
                else if(a[mid]<target)
                    {left = mid+1;}
                    
                else {right = mid-1;}
                
                mid = left+(right-left)/2;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("\nEnter the traget: ");
        int target = sc.nextInt();
        
        System.out.println(DoesPairExists(a,target));
    }
}