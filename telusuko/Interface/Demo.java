package telusuko.Interface;


interface A{
    void show();
    void config();
    int age = 17;// final and static in nature
    String area = "Hyderbad";
}
class B implements A{
    public void show(){
        System.out.println("Hello B");
    }
    public void config(){
        System.out.println("Config B");
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        System.out.println(A.age);
    }
}
