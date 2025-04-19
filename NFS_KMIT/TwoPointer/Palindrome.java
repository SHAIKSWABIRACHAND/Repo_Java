/* 
Given a string s, return true if it is a palindrome, false otherwise.
A string is a palindrome if it reads the same forward as backward. 
That means; after reversing it, it is still the same string. 
For example: "abcdcba", or "racecar".
Note: Use two pointer approach.

Sample test case 
case=1
input=abcdcba
output=true

case=2
input=raceacar
output=false
*/

import java.util.Scanner;
class Palindrome{
    
    static boolean IsPalindrome(String s){
        int left  = 0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(IsPalindrome(s));
    }
}