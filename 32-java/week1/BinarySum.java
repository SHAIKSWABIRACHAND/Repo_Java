import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary1 = sc.next(); // Example binary number 1
        String binary2 = sc.next(); // Example binary number 2

        String sum = addBinary(binary1, binary2);
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + sum);
        sc.close();
    }

    private static String addBinary(String binary1, String binary2) {
        String s = "";
        int carry = 0;
        int maxLength = Math.max(binary1.length(), binary2.length());
        for(int i = 0;i<maxLength;i++){
            int bit1 = (i < binary1.length()) ? binary1.charAt(binary1.length() - 1 - i) - '0' : 0;
            int bit2 = (i < binary2.length()) ? binary2.charAt(binary2.length() - 1 - i) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            carry = sum / 2; // Calculate carry for next iteration
            s = (sum % 2) + s; // Append the current bit to the result
        }
        if(carry ==1){
            s = carry +s;
        }
        return s;
    }
}


