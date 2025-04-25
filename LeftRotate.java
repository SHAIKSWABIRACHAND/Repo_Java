import java.util.ArrayList;
import java.util.List;
public class LeftRotate {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int d = 2; // Number of positions to rotate

        // Left rotate the array
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        leftRotate(arr,2);

        
    }

    private static void leftRotate(List<Integer> arr, int d) {
       
        int a = arr.remove(3);
        arr.add(a);
        System.out.println(a);
    }
}
