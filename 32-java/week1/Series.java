/* 

You are tasked with building a number pattern generator that 
prints a zigzag sequence of squares and cubes based on a simple rule:

For a given integer N, print a pattern of N rows such that:
	- Each row contains exactly as many numbers as the row number.
	- The numbers printed are based on the natural numbers starting 
	from 1, used sequentially across the pattern.
	- For odd-numbered rows (1st, 3rd, 5th, ...), print the square of 
	the numbers in increasing order.
	- For even-numbered rows (2nd, 4th, 6th, ...), print the cube 
	of the numbers in decreasing order.
	
Input:
------
A single integer N

Output:
-------
Print N rows according to the zigzag square-cube 
pattern rule.

Sample Input
-------------
4

Sample Output
--------------
1
27 8
16 25 36
1000 729 512 343

*/
import java.util.*;

class Series{
    
    static void function(int n){
        int count = 1;
        for(int i = 1;i<=n;i++){
            if(i%2 != 0){
                for(int j = 0;j<i;j++){
                    System.out.print(count*count+" ");
                    count++;
                }
            }
            else{
                count = count + (i-1);
                for(int j = 0;j<i;j++){
                    System.out.print(count*count*count+" ");
                    count--;
                }
                
                count = count + i+1;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
        sc.close();
        
    }
}