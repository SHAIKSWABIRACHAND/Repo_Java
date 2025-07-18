/*You are given an integer N. Your task is to generate a triangle 
pattern of N rows with the following rules:
	- Each row r contains exactly r numbers.
	- The numbers in the pattern are calculated using a running 
	counter k, starting from 1 and increasing sequentially.
	- The rule for values in each row depends on whether the row is odd or even:
		- Odd-numbered rows (1st, 3rd, 5th, ...):
		Print the sum of first k natural numbers, in increasing order.
		Formula: 	sum-k = k(k+1)/2
		- Even-numbered rows (2nd, 4th, 6th, ...):
		Print the sum of squares of first k natural numbers, in decreasing order.
		Formula: sum-k (squares) = k(k+1)(2k+1)/6
	- The pattern continues row by row, increasing k for each value printed.

Input:
------
Line-1: A single integer N

Output:
-------
Line-1: Print N rows based on the rules above.


Sample Input:
-------------
4

Sample Output:
---------------
1 
14 5 
10 15 21 
385 285 204 140 

Explanation:
------------
Row 1 (odd):
k=1 → sum = 1
➤ Output: 1

Row 2 (even):
k=2 → sum of squares = 5
k=3 → sum of squares = 14
➤ Reverse: 14 5

Row 3 (odd):
k=4 → sum = 10
k=5 → sum = 15
k=6 → sum = 21
➤ Output: 10 15 21

Row 4 (even):
k=7 → sum of squares = 140
k=8 → sum of squares = 204
k=9 → sum of squares = 285
k=10 → sum of squares = 385
➤ Reverse: 385 285 204 140
*/
import java.util.Scanner;
public class GivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for(int i = 1;i<=n;i++){
            if(i%2 != 0){
                for(int j = 0;j<i;j++){
                    System.out.print(k*(k+1)/2+ " ");
                    k++;
                }
            }
            else{
                k = k +i-1;
                for(int j = 0;j<i;j++){
                    System.out.print(k*(k+1)*(2*k+1)/6 + " ");
                    k--;
                }
                k = k+i+1;
            }
            System.out.println();
        }
        sc.close();

    }
}


