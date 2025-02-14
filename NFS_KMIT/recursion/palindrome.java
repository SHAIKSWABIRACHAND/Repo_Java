import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(IsPalindrome(s,0,s.length()-1));
                sc.close();
            }
        
            static boolean IsPalindrome(String s, int start,int end) {
              if(start>=end){
                return true;
              }
              if(s.charAt(start)!=s.charAt(end)){
                return false;
              }

               return IsPalindrome(s,start+1,end-1);
            }
}