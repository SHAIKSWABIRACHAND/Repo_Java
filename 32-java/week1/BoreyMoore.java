/*
 an alogoithm to 
 */
import java.util.*;
public class BoreyMoore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int num = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            if(count == 0){
                num = nums[i];
                count++;
            }
            if(num == nums[i]){
                count++;  
            }
            else{
                count--;
            }
        }
        System.out.println((count>0? num:"no such number is found"));

        sc.close();
    }
}
