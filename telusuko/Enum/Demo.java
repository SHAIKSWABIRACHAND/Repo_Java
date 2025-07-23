package telusuko.Enum;

public class Demo {
    public static void main(String[] args) {
    //    Laptop lap = Laptop.Macbook;
    // System.out.println(lap+ " " +lap.getPrice());
    for (Laptop i : Laptop.values()){
        System.out.println(i + " " + i.getPrice());
        
    }
}
}