import java.util.Scanner;

class SumOf{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[]  a = new int[n];
       for(int i = 0;i<n;i++){
           a[i]= sc.nextInt();
       }
       System.out.println(Sum(a,0));
    }
    
    

    
    
    static int Sum(int[] a,int i){
        if(i == a.length){
            return 0;
        }
        return (a[i]+Sum(a,i+1));
    }
}
