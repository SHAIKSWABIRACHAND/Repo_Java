package oops;

import java.util.*;
import java.io.*;
public class execp {
    public static void checkOdd(int num){
        if(num % 2 == 1)
        throw new IllegalArgumentException(num+" is not an even number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try{
            checkOdd(num);
            System.out.println("The number is even: " + num);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
