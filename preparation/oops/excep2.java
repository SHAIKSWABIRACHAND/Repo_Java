package oops;

import java.util.Scanner;

public class excep2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.next();
       try{
    System.out.println((checkVowel(text)) ? "The string contains a vowel." : "The string does not contain a vowel.");
       } catch(Exception e){
           System.err.println("An error occurred: " + e.getMessage());
       } finally {
              sc.close();
       }
}
static boolean checkVowel(String text){
         String vowels = "aeiouAEIOU";
       for (int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                throw new IllegalArgumentException("The string contains a vowel: " + ch);
                
            } 
       }
       return false;
}
}

