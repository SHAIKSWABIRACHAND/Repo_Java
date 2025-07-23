package oops;
import java.util.*;
import java.io.*;
public class demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];
       for(int i = 0; i < n; i++) {
           nums[i] = sc.nextInt();}
        List<Integer> list = new ArrayList<>();
        checkForDuplicates(nums, list);
       try{
         
       } catch(Exception e){
           System.err.println("An error occurred: " + e.getMessage());
       } finally {
              sc.close();
       }
}

    private static void checkForDuplicates(int[] nums, List<Integer> list) {
        
        for(int i = 0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            } else {
                System.out.println("Duplicate found: ");
                return;
            }
        }
    }

}