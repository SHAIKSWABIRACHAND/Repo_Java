/*Given a string S in encoded form, and  an integer array indices[] of string length.

You need to find the decoded form of String S, 
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.

Input Format:
-------------
Line-1 -> A String S, enocded string of length L
Line-2 -> L space separated integers indices[], where 0 <=indices[i] < L 

Output Format:
--------------
Print a String, decoded string.


Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4

Sample Output-1:
----------------
memorial

Explanation:
---------------
Given String, aeilmmor
a e i l m m o r
6 1 5 7 2 0 3 4
after shifting,	memorial


Sample Input-2:
---------------
aidin
4 3 2 0 1

Sample Output-2:
----------------
india

Explanation-2:
---------------
Given String, aidin
a i d i n
4 3 2 0 1
after shifting,	india

*/

import java.util.*;
class Encoder{
    
    static String function(String s,int[] a){
        Map<Integer,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i = 0;i<n;i++){
            map.put(a[i],i);
        }
        String s1 = "";
        for(int i = 0;i<n;i++){
            s1+=s.charAt(map.get(i));
        }
        return s1;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            
            a[i] = sc.nextInt();
        }
        String out = function(s,a);
        System.out.print(out);
        sc.close();
        }
        
}


